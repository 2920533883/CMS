//JavaScript代码区域
layui.use('element', function(){
    var element = layui.element;
});
layui.use('table', function(){
    var table = layui.table;
    table.render({
        elem: '#test'
        ,url:'user/getAllUser'
        ,title: '用户数据表'
        ,toolbar: true
        ,cols: [[{field:'id', title:'ID', unresize: true}
            ,{field:'name', title:'用户名'}
            ,{field:'phone', title:'电话号码'}
            ,{field:'password', title:'密码', sort: true}
            ,{field:'role', title:'角色', sort: true, templet: "#role"}
            ,{field:'status', title:'是否认证', templet:"#status"}
            ,{field:'create_time', title:'创建时间', sort: true}
        ]]
        ,page: true
    });
});
