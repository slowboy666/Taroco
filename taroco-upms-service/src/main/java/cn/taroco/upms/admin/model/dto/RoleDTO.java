/*
 *    Copyright (c) 2018-2025, liuht All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: liuht (wangiegie@gmail.com)
 */

package cn.taroco.upms.admin.model.dto;

import cn.taroco.upms.admin.model.entity.SysRole;
import lombok.Data;

/**
 * @author liuht
 * @date 2018/1/20
 * 角色Dto
 */
@Data
public class RoleDTO extends SysRole {
    /**
     * 角色部门Id
     */
    private Integer roleDeptId;

    /**
     * 部门名称
     */
    private String deptName;
}