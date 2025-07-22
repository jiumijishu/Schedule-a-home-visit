package co.xiaoxiang.modules.shop.rest;

import co.xiaoxiang.aop.log.Log;
import co.xiaoxiang.modules.shop.domain.YxCityRegion;
import co.xiaoxiang.modules.shop.service.YxCityRegionService;
import co.xiaoxiang.modules.shop.service.dto.YxCityRegionQueryCriteria;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.*;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

/**
* @author ys
* @date 2023-08-13
*/
@Api(tags = "cityRegion管理")
@RestController
@RequestMapping("/api/yxCityRegion")
public class YxCityRegionController {

    private final YxCityRegionService yxCityRegionService;

    public YxCityRegionController(YxCityRegionService yxCityRegionService) {
        this.yxCityRegionService = yxCityRegionService;
    }

    @Log("导出数据")
    @ApiOperation("导出数据")
    @GetMapping(value = "/download")
    @PreAuthorize("@el.check('yxCityRegion:list')")
    public void download(HttpServletResponse response, YxCityRegionQueryCriteria criteria) throws IOException {
        yxCityRegionService.download(yxCityRegionService.queryAll(criteria), response);
    }

    @GetMapping
    @Log("查询cityRegion")
    @ApiOperation("查询cityRegion")
    @PreAuthorize("@el.check('yxCityRegion:list')")
    public ResponseEntity<Object> getYxCityRegions(YxCityRegionQueryCriteria criteria, Pageable pageable){
        return new ResponseEntity<>(yxCityRegionService.queryAll(criteria,pageable),HttpStatus.OK);
    }

    @PostMapping
    @Log("新增cityRegion")
    @ApiOperation("新增cityRegion")
    @PreAuthorize("@el.check('yxCityRegion:add')")
    public ResponseEntity<Object> create(@Validated @RequestBody YxCityRegion resources){
        return new ResponseEntity<>(yxCityRegionService.create(resources),HttpStatus.CREATED);
    }

    @PutMapping
    @Log("修改cityRegion")
    @ApiOperation("修改cityRegion")
    @PreAuthorize("@el.check('yxCityRegion:edit')")
    public ResponseEntity<Object> update(@Validated @RequestBody YxCityRegion resources){
        yxCityRegionService.update(resources);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Log("删除cityRegion")
    @ApiOperation("删除cityRegion")
    @PreAuthorize("@el.check('yxCityRegion:del')")
    @DeleteMapping
    public ResponseEntity<Object> deleteAll(@RequestBody Long[] ids) {
        yxCityRegionService.deleteAll(ids);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
