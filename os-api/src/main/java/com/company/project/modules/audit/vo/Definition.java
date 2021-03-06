package com.company.project.modules.audit.vo;

import lombok.Data;
import org.flowable.bpmn.model.IOSpecification;
import org.flowable.common.engine.impl.db.SuspensionState;
import org.flowable.engine.ProcessEngineConfiguration;


import java.util.Map;

@Data
public class Definition {

    private String id;
    private String name;
    private String description;
    private String key;
    private int version;
    private String category;
    private String deploymentId;
    private String resourceName;
    private String tenantId = ProcessEngineConfiguration.NO_TENANT_ID;
    private Integer historyLevel;
    private String diagramResourceName;
    private boolean isGraphicalNotationDefined;
    private Map<String, Object> variables;
    private boolean hasStartFormKey;
    private int suspensionState = SuspensionState.ACTIVE.getStateCode();
    private boolean isIdentityLinksInitialized;
    private IOSpecification ioSpecification;
    private Integer appVersion;

    // Backwards compatibility
    private String engineVersion;


    public Boolean getSuspensionState() {
        return suspensionState == 1;
    }
}
