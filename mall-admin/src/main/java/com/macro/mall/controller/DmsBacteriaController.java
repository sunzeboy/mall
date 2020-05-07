package com.macro.mall.controller;

import com.macro.mall.common.api.CommonPage;
import com.macro.mall.common.api.CommonResult;
import com.macro.mall.dto.DmsBacteriaRelationsComplicationDto;
import com.macro.mall.dto.DmsProductsRelationsItem;
import com.macro.mall.model.*;
import com.macro.mall.service.DmsBacteriaProductsService;
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

    @Autowired
    private DmsBacteriaProductsService dmsBacteriaProductsService;

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
    @RequestMapping(value = "/ke/delete/{dmsBacteriaKeId}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteKe(@PathVariable("dmsBacteriaKeId") int dmsBacteriaKeId) {
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
    @RequestMapping(value = "/genus/delete/{dmsBacteriaGenusId}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteGenus(@PathVariable("dmsBacteriaGenusId") int dmsBacteriaGenusId) {
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
    @RequestMapping(value = "/species/delete/{dmsBacteriaSpeciesId}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteSpecies(@PathVariable("dmsBacteriaSpeciesId") int dmsBacteriaSpeciesId) {
        int count = dmsBacteriaService.deleteSpeciesById(dmsBacteriaSpeciesId);
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
    @RequestMapping(value = "/strain/delete/{dmsBacteriaStrainId}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteStrain(@PathVariable("dmsBacteriaStrainId") int dmsBacteriaStrainId) {
        int count = dmsBacteriaService.deleteStrainById(dmsBacteriaStrainId);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }




    @ApiOperation("添加代谢产物")
    @RequestMapping(value = "/products/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult createProducts(@RequestBody DmsBacteriaProducts dmsBacteriaProducts) {
        int count = dmsBacteriaProductsService.createProducts(dmsBacteriaProducts);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("获取代谢产物")
    @RequestMapping(value = "/products/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DmsBacteriaProducts>> listAllProducts(@RequestParam(value = "keyword", required = false) String keyword,
                                                                     @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                     @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<DmsBacteriaProducts> dmsBacteriaProductsList = dmsBacteriaProductsService.listAllProducts(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(dmsBacteriaProductsList));
    }

    @ApiOperation("编辑代谢产物")
    @RequestMapping(value = "/products/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateProduct(@RequestBody DmsBacteriaProducts dmsBacteriaProducts) {
        int count = dmsBacteriaProductsService.updateProduct(dmsBacteriaProducts);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除代谢产物")
    @RequestMapping(value = "/products/delete/{dmsBacteriaStrainId}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteProduct(@PathVariable("dmsBacteriaStrainId") int dmsBacteriaStrainId) {
        int count = dmsBacteriaProductsService.deleteProductById(dmsBacteriaStrainId);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }


    @ApiOperation("获取代谢产物与菌类的关系")
    @RequestMapping(value = "/productsRelations/findAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DmsProductsRelationsItem>> findAllProductsRelations(@RequestParam(value = "keyword", required = false) String keyword,
                                      @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                      @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<DmsProductsRelationsItem> relations = dmsBacteriaProductsService.listAllRelationsStrainAndProducts(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(relations));
    }

    @ApiOperation("添加代谢产物与菌类的关系")
    @RequestMapping(value = "/productsRelations/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult createRelationsStrainAndProducts(@RequestBody DmsBacteriaRelationsProducts dmsBacteriaRelationsProducts) {
        int count = dmsBacteriaProductsService.createRelationsStrainAndProducts(dmsBacteriaRelationsProducts);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("更新代谢产物与菌类的关系")
    @RequestMapping(value = "/productsRelations/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateRelationsStrainAndProducts(@RequestBody DmsBacteriaRelationsProducts dmsBacteriaRelationsProducts) {
        int count = dmsBacteriaProductsService.updateRelationsStrainAndProducts(dmsBacteriaRelationsProducts);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除代谢产物与菌类的关系")
    @RequestMapping(value = "/productsRelations/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteRelationsStrainAndProducts(@RequestBody DmsBacteriaRelationsProducts dmsBacteriaRelationsProducts) {
        int count = dmsBacteriaProductsService.deleteRelationsStrainAndProducts(dmsBacteriaRelationsProducts);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }



    @ApiOperation("添加")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody DmsBacteriaInfo dmsBacteriaInfo) {
        int count = dmsBacteriaService.createBacteria(dmsBacteriaInfo);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("获取全部")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DmsBacteriaInfo>> listAllKe(@RequestParam(value = "keyword", required = false) String keyword,
                                                             @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                             @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                               @RequestParam(value = "bacteriaType", required = false) Integer bacteriaType ) {
        List<DmsBacteriaInfo> dmsBacteriaList = dmsBacteriaService.listAllBacterias(keyword, pageSize, pageNum, bacteriaType);
        return CommonResult.success(CommonPage.restPage(dmsBacteriaList));
    }


    @ApiOperation("编辑")
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult update(@RequestBody DmsBacteriaInfo dmsBacteriaInfo) {
        int count = dmsBacteriaService.updateBacteria(dmsBacteriaInfo);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除")
    @RequestMapping(value = "/delete/{dmsBacteriaId}", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult delete(@PathVariable("dmsBacteriaId") int dmsBacteriaId) {
        int count = dmsBacteriaService.deleteBacteriaById(dmsBacteriaId);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }


    @ApiOperation("添加")
    @RequestMapping(value = "/relations/complication/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult createRelationsComplication(@RequestBody DmsBacteriaRelationsComplication dmsBacteriaRelationsComplication) {
        int count = dmsBacteriaService.createBacteriaRelationsComplication(dmsBacteriaRelationsComplication);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("获取全部")
    @RequestMapping(value = "/relations/complication/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<DmsBacteriaRelationsComplicationDto>> listAllBacteriaRelationsComplications(@RequestParam(value = "keyword", required = false) String keyword,
                                                                                   @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                                                   @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum ) {
        List<DmsBacteriaRelationsComplicationDto> dmsBacteriaList = dmsBacteriaService.listAllBacteriaRelationsComplications(keyword, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(dmsBacteriaList));
    }


    @ApiOperation("编辑")
    @RequestMapping(value = "/relations/complication/update", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult updateBacteriaRelationsComplication(@RequestBody DmsBacteriaRelationsComplication dmsBacteriaRelationsComplication) {
        int count = dmsBacteriaService.updateBacteriaRelationsComplication(dmsBacteriaRelationsComplication);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("删除")
    @RequestMapping(value = "/relations/complication/delete", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult deleteBacteriaRelationsComplication(@RequestBody DmsBacteriaRelationsComplication dmsBacteriaRelationsComplication) {
        int count = dmsBacteriaService.deleteBacteriaRelationsComplication(dmsBacteriaRelationsComplication);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }
}
