import request from '@/utils/request'
import { downLoadZip } from '@/utils/zipdownload'

const url = '/engine/code'

export function getList(data) {
  return request({
    url: url,
    method: 'get',
    params: data
  })
}

export function generate(data) {
  downLoadZip(url + '/generate', data)
}
