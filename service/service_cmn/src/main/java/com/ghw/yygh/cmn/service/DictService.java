package com.ghw.yygh.cmn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ghw.yygh.model.cmn.Dict;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface DictService extends IService<Dict> {

    List<Dict> findChlidData(Long id);

    List<Dict> findByDictCode(String dictCode);

    void exportDictData(HttpServletResponse response);

    void importDictData(MultipartFile file);
}
