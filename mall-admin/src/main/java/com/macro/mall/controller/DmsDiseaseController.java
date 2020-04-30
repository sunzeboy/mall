package com.macro.mall.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.dto.DmsDiseaseRelationsItem;
import com.macro.mall.dto.DmsProductsRelationsItem;
import com.macro.mall.model.DmsBacteriaKe;
import com.macro.mall.model.DmsBacteriaRelationsStrainProducts;
import com.macro.mall.model.DmsDiseaseInfo;
import com.macro.mall.model.DmsDiseaseRelationsStrain;
import com.macro.mall.service.DmsBacteriaService;
import com.macro.mall.service.DmsDiseaseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : sunze
 * create at:  2020/4/26  3:48 下午
 * @description: 疾病类
 */
@Controller
@Api(tags = "DmsDiseaseController", description = "疾病数据管理")
@RequestMapping("/disease")
public class DmsDiseaseController {
    @Autowired
    private DmsDiseaseService dmsDiseaseService;

    @ApiOperation("添加疾病")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult createDisease(@RequestBody DmsDiseaseInfo dmsDiseaseInfo) {
        int count = dmsDiseaseService.createDisease(dmsDiseaseInfo);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("获取全部疾病")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DmsDiseaseInfo>> listAllDisease(@RequestParam(value = "keyword", required = false) String keyword,
                                                             @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                             @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum ) {
        List<DmsDiseaseInfo> dmsBacteriaKeList = dmsDiseaseService.listAllDiseases(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(dmsBacteriaKeList));
    }


    @ApiOperation("编辑疾病")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateDisease(@RequestBody DmsDiseaseInfo dmsDiseaseInfo) {
        int count = dmsDiseaseService.updateDisease(dmsDiseaseInfo);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除疾病")
    @RequestMapping(value = "/delete/{dmsDiseaseInfoId}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteDisease(@PathVariable("dmsDiseaseInfoId") int dmsDiseaseInfoId) {
        int count = dmsDiseaseService.deleteDiseaseById(dmsDiseaseInfoId);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("获取疾病与菌类的关系")
    @RequestMapping(value = "/relations/findAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DmsDiseaseRelationsItem>> findAllDiseaseRelations(@RequestParam(value = "keyword", required = false) String keyword,
                                                                                       @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<DmsDiseaseRelationsItem> relations = dmsDiseaseService.listAllDiseasesRelations(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(relations));
    }

    @ApiOperation("添加疾病与菌类的关系")
    @RequestMapping(value = "/relations/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult createDiseaseRelations(@RequestBody DmsDiseaseRelationsStrain dmsDiseaseRelationsStrain) {
        int count = dmsDiseaseService.createDiseaseRelations(dmsDiseaseRelationsStrain);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("更新疾病与菌类的关系")
    @RequestMapping(value = "/relations/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateDiseaseRelations(@RequestBody DmsDiseaseRelationsStrain dmsDiseaseRelationsStrain) {
        int count = dmsDiseaseService.updateDiseaseRelations(dmsDiseaseRelationsStrain);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除疾病与菌类的关系")
    @RequestMapping(value = "/relations/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteDiseaseRelations(@RequestBody DmsDiseaseRelationsStrain dmsDiseaseRelationsStrain) {
        int count = dmsDiseaseService.deleteDiseaseRelationsById(dmsDiseaseRelationsStrain);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }
}