package com.nikai.order.controller;

import com.jiatui.spi.ServiceResponse;
import com.nikai.order.dto.Order;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * hello-world com.nikai.order.controller
 *
 * @author: nikai
 * @Description:
 * @Date: Create in 21:15 2018/11/11
 * @Modified By:
 */

/**
 * 订单相关接口
 *
 * @author keni@aijiatui.com
 * @version 1.0.0
 * @domain ORDER
 */
@RestController
public class OrderController {

    /**
     * 查询所有订单信息
     *
     * @return 订单列表
     * @service 查询所有订单信息
     * @scene 小程序
     * @type QUERY
     * @code 0#成功
     * @code 1#系统异常
     * @code 41003#参数失败
     * @code 2#操作繁忙
     */
    @GetMapping("/all-orders/query")
    @ResponseBody
    public ServiceResponse<List<Order>> queryAll() {
        return null;
    }

    /**
     * 分页查询所有订单信息
     *
     * @return 订单列表
     * @service 分页查询所有订单信息
     * @scene 小程序
     * @type QUERY
     * @param start 起始位置
     * @param length 页大小
     *
     * @code 0#成功
     * @code 1#系统异常
     * @code 41003#参数失败
     * @code 2#操作繁忙
     */
    @PostMapping("/orders-by-page/query")
    @ResponseBody
    public ServiceResponse<Map<String, Object>> queryByPage(Integer start, Integer length) {
        return null;
    }

    /**
     * 根据订单ID查询所有订单信息
     *
     * @return 订单列表
     * @service 根据订单ID查询所有订单信息
     * @scene 小程序
     * @type QUERY
     * @param id 订单ID
     * @code 0#成功
     * @code 1#系统异常
     * @code 41003#参数失败
     * @code 2#操作繁忙
     */
    @GetMapping("/order-by-id/query")
    @ResponseBody
    public ServiceResponse<Order> queryById(Long id) {
        return null;
    }

    /**
     * 创建订单
     *
     * @return 新增结果
     * @service 创建订单
     * @scene 小程序
     * @type COMMAND
     * @param order 订单信息
     * @code 0#成功
     * @code 1#系统异常
     * @code 41003#参数失败
     * @code 2#操作繁忙
     */
    @PostMapping("/order/create")
    @ResponseBody
    public ServiceResponse<String> save(Order order) {
        return null;
    }

    /**
     * 更新订单信息
     *
     * @return 订单列表
     * @service 更新订单信息
     * @scene 小程序
     * @type COMMAND
     * @param order 订单信息
     * @code 0#成功
     * @code 1#系统异常
     * @code 41003#参数失败
     * @code 2#操作繁忙
     */
    @PostMapping("/order/update")
    @ResponseBody
    public ServiceResponse<String> update(Order order) {
        return null;
    }

    /**
     * 删除订单
     *
     * @return 订单列表
     * @service 删除订单
     * @scene 小程序
     * @type COMMAND
     * @param order 订单信息
     * @code 0#成功
     * @code 1#系统异常
     * @code 41003#参数失败
     * @code 2#操作繁忙
     */
    @PostMapping("/order/delete")
    @ResponseBody
    public ServiceResponse<String> delete(Order order) {
        return null;
    }

}
