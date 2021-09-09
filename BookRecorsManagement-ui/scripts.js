// api url
const api_url =
    "http://localhost:8080/book/all";

const pagin_url =
    "http://localhost:8080/book/all/page/1/size/7";

// Defining async function
async function getapi(url) {

    console.log("Function got call !");

    // Storing response
    const response = await fetch(url);

    // Storing data in form of JSON
    var data = await response.json();
    console.log(data);
    if (response) {
        hideloader();
    }
    show(data);
}

// Calling that async function
getapi(api_url);

// Function to hide the loader
function hideloader() {
    document.getElementById('loading').style.display = 'none';
}
// Function to define innerHTML for HTML table
function show(data) {
    let tab =
        ``;

    // Loop to access all books data and display  
    for (let r of data) {
        tab +=
            `<div class="card"> 
    <div class="h1 title">${r.title} </div>
    <hr>
    <div style="font-size : 14px;color: grey;">${r.desc}</div>
    

    <div style="font-size: 14px; margin-top: 10px;">
    <div>
        <span style="color: grey;">Written By - </span> <span >${r.authorId} </span>
    </div>
    <div>
        <span style="color: grey;">Published By - </span> <span >${r.publisherId} </span>
    </div>
    </div>
    
    <hr>

    <div style="font-size: 15px">
    ${r.language}
     <span style="margin-left: 70px; margin-top: 200px;">
     ${r.publishedDate}</span>
    
     </div> 
 
</div>`;
    }
    // Setting innerHTML as tab variable
    document.getElementById("books").innerHTML = tab;
}
