//JavaScript代码区域
layui.use('element', function(){
    var element = layui.element;
});

layui.use('table', function(){
    var table = layui.table;
    table.render({
        elem: '#test'
        ,url:'manager/getAllManager'
        ,title: '用户数据表'
        ,toolbar: true
        ,cols: [[{field:'id', title:'ID', unresize: true}
            ,{field:'name', title:'用户名'}
            ,{field:'phone', title:'电话号码', sort: true}
        ]]
        ,page: true
    });
});