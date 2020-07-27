//JavaScript代码区域
layui.use('element', function(){
    var element = layui.element;
});

var layer;
layui.use('layer', function () {
    layer = layui.layer;

})
function showDetail(img, content) {
    layer.open({
        type: 1,
        area: ['500px', '300px'],
        content: "<div><img src="+img+"><hr><p>详情：</p><span>"+content+"</span></div>"
    })
}