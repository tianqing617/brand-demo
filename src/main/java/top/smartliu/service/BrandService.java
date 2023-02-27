package top.smartliu.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import top.smartliu.mapper.BrandMapper;
import top.smartliu.pojo.Brand;
import top.smartliu.utils.SqlSessionFactoryUtils;
import java.util.List;

public class BrandService {
    // 1. 加载MyBatis核心配置文件，获取SqlSessionFactory实例
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

    public List<Brand> selectAll(){
        // 2. 获取SqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 3. 获取BrandMapper
        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);

        //4. 调用方法
        List<Brand> brands = mapper.selectAll();

        sqlSession.close();

        return brands;
    }
}
