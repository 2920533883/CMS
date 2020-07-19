//JavaScript代码区域
layui.use('element', function(){
    var element = layui.element;
});
let myLayer = document.getElementById("myLayer");
let search_name = document.getElementById("search_name");
let search_company = document.getElementById("search_company");
let show_name = document.querySelectorAll("#show_name");
let show_company = document.querySelectorAll("#show_company");
let show_phone = document.querySelectorAll("#show_phone");
let show_salary = document.querySelectorAll("#show_salary");
let show_position = document.querySelectorAll("#show_position");
let show_empId = document.querySelectorAll("#show_empId");
function searchClear() {
    search_name.value = "";
    search_company.value = "";
}
function changeItem(id, index) {
    myLayer.style.display = "block";
    myLayer.action = "/views/updateCus";
    change_id.value = id;
    document.getElementById("change_name").value = show_name[index].innerHTML;
    document.getElementById("change_company").value = show_company[index].innerHTML;
    document.getElementById("change_salary").value = show_salary[index].innerHTML;
    document.getElementById("change_position").value = show_position[index].innerHTML;
    document.getElementById("change_phone").value = show_phone[index].innerHTML;
    document.getElementById("change_empId").value = show_empId[index].innerHTML;
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
    window.location.href="http://localhost:8080/views/deleteCus?id="+id;
}

function insertItem() {
    myLayer.action = "/views/insertCus";
    change_id.value = -1;
    document.getElementById("myLayer").style.display = "block";
}