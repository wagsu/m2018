package sw.melody.modules.docker.dao;

import org.apache.ibatis.annotations.Mapper;
import sw.melody.modules.docker.entity.SampleEntity;
import sw.melody.modules.sys.dao.BaseDao;

@Mapper
public interface SampleDao extends BaseDao<SampleEntity> {
}
