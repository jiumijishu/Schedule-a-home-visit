package co.xiaoxiang.modules.shop.rest;

import co.xiaoxiang.aop.log.Log;
import co.xiaoxiang.modules.shop.domain.YxStorePretype;
import co.xiaoxiang.modules.shop.service.YxStorePretypeService;
import co.xiaoxiang.modules.shop.service.dto.YxStorePretypeQueryCriteria;
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
* @author 雨神
* @date 2023-07-16
*/
@Api(tags = "pretype管理")
@RestController
@RequestMapping("/api/yxStorePretype")
public class YxStorePretypeController {

    private final YxStorePretypeService yxStorePretypeService;

    public YxStorePretypeController(YxStorePretypeService yxStorePretypeService) {
        this.yxStorePretypeService = yxStorePretypeService;
    }

    @Log("导出数据")
    @ApiOperation("导出数据")
    @GetMapping(value = "/download")
    @PreAuthorize("@el.check('yxStorePretype:list')")
    public void download(HttpServletResponse response, YxStorePretypeQueryCriteria criteria) throws IOException {
        yxStorePretypeService.download(yxStorePretypeService.queryAll(criteria), response);
    }

    @GetMapping
    @Log("查询pretype")
    @ApiOperation("查询pretype")
    @PreAuthorize("@el.check('yxStorePretype:list')")
    public ResponseEntity<Object> getYxStorePretypes(YxStorePretypeQueryCriteria criteria, Pageable pageable){
        return new ResponseEntity<>(yxStorePretypeService.queryAll(criteria,pageable),HttpStatus.OK);
    }

    @GetMapping("/getAllPreType")
    public ResponseEntity<Object> getAllPreType(YxStorePretypeQueryCriteria criteria){
        criteria.setShowFlag("Y");
        return new ResponseEntity<>(yxStorePretypeService.queryAll(criteria),HttpStatus.OK);
    }

    @PostMapping
    @Log("新增pretype")
    @ApiOperation("新增pretype")
    @PreAuthorize("@el.check('yxStorePretype:add')")
    public ResponseEntity<Object> create(@Validated @RequestBody YxStorePretype resources){
        return new ResponseEntity<>(yxStorePretypeService.create(resources),HttpStatus.CREATED);
    }

    @PutMapping
    @Log("修改pretype")
    @ApiOperation("修改pretype")
    @PreAuthorize("@el.check('yxStorePretype:edit')")
    public ResponseEntity<Object> update(@Validated @RequestBody YxStorePretype resources){
        yxStorePretypeService.update(resources);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Log("删除pretype")
    @ApiOperation("删除pretype")
    @PreAuthorize("@el.check('yxStorePretype:del')")
    @DeleteMapping
    public ResponseEntity<Object> deleteAll(@RequestBody Integer[] ids) {
        yxStorePretypeService.deleteAll(ids);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
