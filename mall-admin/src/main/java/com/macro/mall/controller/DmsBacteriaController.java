package com.macro.mall.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.model.DmsBacteriaGenus;
import com.macro.mall.model.DmsBacteriaKe;
import com.macro.mall.service.DmsBacteriaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public CommonResult<List<DmsBacteriaKe>> listAllKe() {
        List<DmsBacteriaKe> dmsBacteriaKeList = dmsBacteriaService.listAllKe();
        return CommonResult.success(dmsBacteriaKeList);
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
    public CommonResult<List<DmsBacteriaGenus>> listAllGenus() {
        List<DmsBacteriaGenus> dmsBacteriaGenusList = dmsBacteriaService.listAllGenus();
        return CommonResult.success(dmsBacteriaGenusList);
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

}
