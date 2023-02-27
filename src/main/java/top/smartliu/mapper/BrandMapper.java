package top.smartliu.mapper;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import top.smartliu.pojo.Brand;

import java.util.List;

public interface BrandMapper {
    @Select("select * from tb_brand")
    @ResultMap("brandResultMap")
    List<Brand> selectAll();
}
