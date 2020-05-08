package com.macro.mall.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.model.DmsDiseaseInfo;
import com.macro.mall.model.DmsExperimentalResource;
import com.macro.mall.service.DmsExperimentalResourceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : sunze
 * create at:  2020/5/8  8:54 下午
 * @description:
 */
@Controller
@Api(tags = "DmsExperimentalResourceController", description = "研究对象数据管理")
@RequestMapping("/experimental")
public class DmsExperimentalResourceController {
    @Autowired
    private DmsExperimentalResourceService dmsExperimentalResourceService;

    @ApiOperation("添加研究对象")
    @RequestMapping(value = "/resource/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult createResource(@RequestBody DmsExperimentalResource dmsExperimentalResource) {
        int count = dmsExperimentalResourceService.createExperimentalResource(dmsExperimentalResource);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("获取全部研究对象")
    @RequestMapping(value = "/resource/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DmsExperimentalResource>> listAllResources(@RequestParam(value = "keyword", required = false) String keyword,
                                                                   @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                   @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum ) {
        List<DmsExperimentalResource> dmsBacteriaKeList = dmsExperimentalResourceService.listAllExperimentalResource(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(dmsBacteriaKeList));
    }


    @ApiOperation("编辑研究对象")
    @RequestMapping(value = "/resource/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateResource(@RequestBody DmsExperimentalResource dmsExperimentalResource) {
        int count = dmsExperimentalResourceService.updateExperimentalResource(dmsExperimentalResource);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除研究对象")
    @RequestMapping(value = "/resource/delete/{dmsExperimentalResourceId}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteResource(@PathVariable("dmsExperimentalResourceId") int dmsExperimentalResourceId) {
        int count = dmsExperimentalResourceService.deleteExperimentalResourceById(dmsExperimentalResourceId);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }
}