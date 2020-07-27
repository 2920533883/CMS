//JavaScript代码区域
layui.use('element', function(){
    var element = layui.element;
});

layui.use('table', function(){
    var table = layui.table;
    table.render({
        elem: '#test'
        ,url:'/books/getAllSellableBooks'
        ,title: '商品数据表'
        ,toolbar: true
        ,cols: [[{field:'id', title:'ID', unresize: true}
            ,{field:'name', title:'用户名', sort: true}
            ,{field:'price', title:'价格', sort: true}
            ,{field:'content', title:'描述'}
            ,{field:'user', title:'卖家'}
            ,{field:'tag', title:'分类', sort: true}
        ]]
        ,page: true
    });
});