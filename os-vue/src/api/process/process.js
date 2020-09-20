import request from '@/utils/request'

const url = '/process/instance'

export function add(data) {
  return request({
    url: url + '/start',
    method: 'post',
    headers: {
      'Content-Type': 'application/json; charset=utf-8'
    },
    data: JSON.stringify(data)
  })
}

export function commit(data) {
  return request({
    url: url + '/commit',
    method: 'post',
    headers: {
      'Content-Type': 'application/json; charset=utf-8'
    },
    data: JSON.stringify(data)
  })
}
