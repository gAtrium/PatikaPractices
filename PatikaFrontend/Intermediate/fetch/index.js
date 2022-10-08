const axios = require("axios");


const dostuff = async (num) => {
    let uid = "https://jsonplaceholder.typicode.com/users/";
    let pid = "https://jsonplaceholder.typicode.com/posts?userId=";

    let {data: udata} = await axios(uid + num);
    let {data: pdata} = await axios(pid+num);
    udata["posts"] = pdata
    return udata
}

(async() => {
    console.log(await dostuff(1));
})();
