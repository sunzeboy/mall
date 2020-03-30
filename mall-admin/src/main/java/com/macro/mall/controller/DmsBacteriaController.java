package com.macro.mall.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.model.*;
import com.macro.mall.service.DmsBacteriaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@Api(tags = "DmsBacteriaController", description = "菌种数据管理")
@RequestMapping("/bacteria")
public class DmsBacteriaController {

    @Autowired
    private DmsBacteriaService dmsBacteriaService;

    @ApiOperation("添加科")
    @RequestMapping(value = "/ke/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult createKe(@RequestBody DmsBacteriaKe dmsBacteriaKe) {
        int count = dmsBacteriaService.createKe(dmsBacteriaKe);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("获取全部科")
    @RequestMapping(value = "/ke/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DmsBacteriaKe>> listAllKe(@RequestParam(value = "keyword", required = false) String keyword,
                                                       @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum ) {
        List<DmsBacteriaKe> dmsBacteriaKeList = dmsBacteriaService.listAllKe(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(dmsBacteriaKeList));
    }


    @ApiOperation("编辑科")
    @RequestMapping(value = "/ke/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateKe(@RequestBody DmsBacteriaKe dmsBacteriaKe) {
        int count = dmsBacteriaService.updateKe(dmsBacteriaKe);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除科")
    @RequestMapping(value = "/ke/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteKe(@RequestBody int dmsBacteriaKeId) {
        int count = dmsBacteriaService.deleteKeById(dmsBacteriaKeId);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }


    @ApiOperation("添加属")
    @RequestMapping(value = "/genus/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult createGenus(@RequestBody DmsBacteriaGenus dmsBacteriaGenus) {
        int count = dmsBacteriaService.createGenus(dmsBacteriaGenus);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("获取全部属")
    @RequestMapping(value = "/genus/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DmsBacteriaGenus>> listAllGenus(@RequestParam(value = "keyword", required = false) String keyword,
                                                             @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                             @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<DmsBacteriaGenus> dmsBacteriaGenusList = dmsBacteriaService.listAllGenus(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(dmsBacteriaGenusList));
    }

    @ApiOperation("编辑属")
    @RequestMapping(value = "/genus/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateGenus(@RequestBody DmsBacteriaGenus dmsBacteriaGenus) {
        int count = dmsBacteriaService.updateGenus(dmsBacteriaGenus);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除属")
    @RequestMapping(value = "/genus/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteGenus(@RequestBody int dmsBacteriaGenusId) {
        int count = dmsBacteriaService.deleteGenusById(dmsBacteriaGenusId);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }



    @ApiOperation("添加种")
    @RequestMapping(value = "/species/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult createGenus(@RequestBody DmsBacteriaSpecies dmsBacteriaSpecies) {
        int count = dmsBacteriaService.createSpecies(dmsBacteriaSpecies);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("获取种")
    @RequestMapping(value = "/species/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DmsBacteriaSpecies>> listAllSpecies(@RequestParam(value = "keyword", required = false) String keyword,
                                                                   @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                   @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<DmsBacteriaSpecies> dmsBacteriaGenusList = dmsBacteriaService.listAllSpecies(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(dmsBacteriaGenusList));
    }

    @ApiOperation("编辑种")
    @RequestMapping(value = "/species/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateSpecies(@RequestBody DmsBacteriaSpecies dmsBacteriaSpecies) {
        int count = dmsBacteriaService.updateSpecies(dmsBacteriaSpecies);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除种")
    @RequestMapping(value = "/species/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteSpecies(@RequestBody int dmsBacteriaSpeciesId) {
        int count = dmsBacteriaService.deleteGenusById(dmsBacteriaSpeciesId);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }


    @ApiOperation("添加株")
    @RequestMapping(value = "/strain/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult createStrain(@RequestBody DmsBacteriaStrain dmsBacteriaStrain) {
        int count = dmsBacteriaService.createStrain(dmsBacteriaStrain);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("获取株")
    @RequestMapping(value = "/strain/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DmsBacteriaStrain>> listAllStrain(@RequestParam(value = "keyword", required = false) String keyword,
                                                                       @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                       @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<DmsBacteriaStrain> dmsBacteriaStrainList = dmsBacteriaService.listAllStrain(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(dmsBacteriaStrainList));
    }

    @ApiOperation("编辑株")
    @RequestMapping(value = "/strain/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateStrain(@RequestBody DmsBacteriaStrain dmsBacteriaStrain) {
        int count = dmsBacteriaService.updateStrain(dmsBacteriaStrain);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除株")
    @RequestMapping(value = "/strain/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteStrain(@RequestBody int dmsBacteriaStrainId) {
        int count = dmsBacteriaService.deleteStrainById(dmsBacteriaStrainId);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

}
