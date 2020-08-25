package com.company.project.modules.sys.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.company.project.core.Result;
import com.company.project.modules.sys.entity.Role;
import com.company.project.modules.sys.service.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * 角色 前端控制器
 * </p>
 *
 * @author root
 * @since 2020-08-24
 */
@RestController
@RequestMapping("/sys/role")
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @PostMapping
    public Result<?> add(@RequestBody Role role) {
        roleService.save(role);
        return Result.success();
    }

    @DeleteMapping
    public Result<?> delete(@RequestBody List<Long> ids) {
        roleService.removeByIds(ids);
        return Result.success();
    }

    @PutMapping
    public Result<?> update(@RequestBody Role role) {
        roleService.updateById(role);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result<Role> detail(@PathVariable Integer id) {
        Role role = roleService.getById(id);
        return Result.success(role);
    }

    @GetMapping
    public Result<Page<Role>> page(@RequestParam(defaultValue = "0") Integer current, @RequestParam(defaultValue = "10") Integer size, @RequestParam Map<String, Object> params) {
        Page<Role> page = roleService.page(new Page<>(current, size, true), new QueryWrapper<Role>()
                .eq(Objects.nonNull(params.get("id")), "id", params.get("id"))
        );
        return Result.success(page);
    }

    @GetMapping("/option")
    public Result<List<Role>> option() {
        List<Role> list = roleService.list(new QueryWrapper<Role>().select("id","role_name"));
        return Result.success(list);
    }
}
