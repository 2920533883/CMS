//JavaScript代码区域
layui.use('element', function(){
    var element = layui.element;
});
let myLayer = document.getElementById("myLayer");
let search_username = document.getElementById("search_username");
let search_realName = document.getElementById("search_realName");
let change_id = document.getElementById("change_id");
let change_username = document.getElementById("change_username");
let change_password = document.getElementById("change_password");
let change_realName = document.getElementById("change_realName");
let change_img = document.getElementById("change_img");
let change_sub = document.getElementById("change_submit");
let change_clear = document.getElementById("#change_clear");
let show_username = document.querySelectorAll("#show_username");
let show_password = document.querySelectorAll("#show_password");
let show_realName = document.querySelectorAll("#show_realName");
let show_img = document.querySelectorAll("#show_img");
function searchClear() {
    search_realName.value = "";
    search_username.value = "";
}
function changeItem(id, index) {
    myLayer.style.display = "block";
    myLayer.action = "/views/changeEmp";
    change_id.value = id;
    change_username.value = show_username[index].innerHTML;
    change_password.value = show_password[index].innerHTML;
    change_realName.value = show_realName[index].innerHTML;
    change_img.value = show_img[index].src;
}
function changeClear() {
    change_username.value = "";
    change_password.value = "";
    change_realName.value = "";
}
function changeClose() {
    document.getElementById("myLayer").style.display = "none";
}

function delItem(id) {
    window.location.href="http://localhost:8080/views/deleteEmp?id="+id;
}

function insertItem() {
    myLayer.action = "/views/insertEmp";
    change_id.value = -1;
    document.getElementById("myLayer").style.display = "block";
}