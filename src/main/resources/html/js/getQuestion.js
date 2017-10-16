$(document).ready(function() {
    $.ajax({
        url: "http://localhost:9090/serverunq/question/example"
    }).then(function(data) {
        $('.question-type').append(data.type);
        $('.question-content').append(data.text);
    });
});