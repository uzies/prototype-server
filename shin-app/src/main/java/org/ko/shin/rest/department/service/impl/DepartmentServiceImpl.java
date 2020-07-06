package org.ko.shin.rest.department.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.ko.shin.core.exception.BusinessException;
import org.ko.shin.core.constant.SystemCode;
import org.ko.shin.data.entity.Department;
import org.ko.shin.rest.department.condition.QueryDepartmentCondition;
import org.ko.shin.rest.department.repository.DepartmentRepository;
import org.ko.shin.rest.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Throwable.class)
public class DepartmentServiceImpl extends ServiceImpl<DepartmentRepository, Department> implements DepartmentService {

    /**
     * 部门表数据库对象
     */
    @Autowired private DepartmentRepository departmentRepository;

    @Override
    public List<Department> queryDepartmentList(QueryDepartmentCondition condition) {
        return departmentRepository.selectList(new QueryWrapper<>());
    }

    @Override
    public Department queryDepartmentInfo(Long id) {
        return departmentRepository.selectById(id);
    }

    @Override
    public Long createDepartment(Department department) {
        if (departmentRepository.insert(department) == 0) {
            throw new BusinessException(SystemCode.UNKNOWN_ERROR);
        }
        return department.getId();
    }

    @Override
    public Department updateDepartment(Long id, Department department) {
        department.setId(id);
        if (departmentRepository.updateById(department) == 0) {
            throw new BusinessException(SystemCode.UNKNOWN_ERROR);
        }
        return department;
    }

    @Override
    public Long deleteDepartment(Long id) {
        if (departmentRepository.deleteById(id) == 0) {
            throw new BusinessException(SystemCode.UNKNOWN_ERROR);
        }
        return id;
    }


}