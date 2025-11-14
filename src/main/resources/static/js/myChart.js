let charDataStr = decodeHtml(chartData)
let chartJsonArray = JSON.parse(charDataStr)

let arrayLength = chartJsonArray.length
let numbericData = []
let labelData = []

for(let i = 0; i < arrayLength; i++){
    numbericData[i] = chartJsonArray[i].value
    labelData[i] = chartJsonArray[i].label
}


// 饼图
const data = {
    labels: labelData,
    datasets: [{
        label: 'My First Dataset',
        data: numbericData,
        backgroundColor: [
            'rgb(255, 99, 132)',
            'rgb(54, 162, 235)',
            'rgb(255, 205, 86)'
        ],
        hoverOffset: 4
    }]
};

// 配置选项
const options = {
    plugins:{
        title:{
            display: true,
            text: '项目状态',
        }
    }
}

new Chart(document.getElementById("myPieChart"), {
    type: 'pie',
    data: data,
    options: options
})

// [{"value": 1, "label":"未开始"}, {"value": 2, "label":"进行中"}, {"value": 3, "label":"已完成"}]
function decodeHtml(html){
    let txt = document.createElement("textarea");
    txt.innerHTML = html;
    return txt.value;
}