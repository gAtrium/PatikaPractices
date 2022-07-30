const menu = [
  {
    id: 1,
    title: "Tteokbokki",
    category: "Korea",
    price: 10.99,
    img:
      "https://twoplaidaprons.com/wp-content/uploads/2020/09/tteokbokki-top-down-view-of-tteokbokki-in-a-bowl-500x500.jpg",
    desc: `Spicy rice cakes, serving with fish cake.`,
  },
  {
    id: 2,
    title: "Chicken Ramen",
    category: "Japan",
    price: 7.99,
    img:
      "https://www.forkknifeswoon.com/wp-content/uploads/2014/10/simple-homemade-chicken-ramen-fork-knife-swoon-01.jpg",
    desc: `Chicken noodle soup, serving with vegetables such as soy bean, green onion. In an optional you can ask for egg. `,
  },
  {
    id: 3,
    title: "Bibimbap",
    category: "Korea",
    price: 8.99,
    img:
      "https://dwellbymichelle.com/wp-content/uploads/2020/05/DWELL-bibimbap.jpg",
    desc: `Boiling vegetables, serving with special hot sauce`,
  },
  {
    id: 4,
    title: "Dan Dan Mian",
    category: "China",
    price: 5.99,
    img:
      "https://www.savingdessert.com/wp-content/uploads/2019/02/Dan-Dan-Noodles-10.jpg",
    desc: `Dan dan noodle, serving with green onion `,
  },
  {
    id: 5,
    title: "Yangzhou Fried Rice",
    category: "China",
    price: 12.99,
    img:
      "https://salu-salo.com/wp-content/uploads/2013/02/Yangzhou-Fried-Rice1.jpg",
    desc: `Yangzhou style fried rice, serving with bean and pickles `,
  },
  {
    id: 6,
    title: "Onigiri",
    category: "Japan",
    price: 9.99,
    img:
      "https://www.manusmenu.com/wp-content/uploads/2017/08/Onigiri-3-1-of-1.jpg",
    desc: `Rice Sandwich, serving with soy sauce`,
  },
  {
    id: 7,
    title: "Jajangmyeon",
    category: "Korea",
    price: 15.99,
    img:
      "https://www.curiouscuisiniere.com/wp-content/uploads/2020/04/Jajangmyeon-Korean-Noodles-in-Black-Bean-Sauce5.1200H-720x540.jpg",
    desc: `Black bean sauce noodle, serving with green onion `,
  },
  {
    id: 8,
    title: "Ma Yi Shang Shu",
    category: "China",
    price: 12.99,
    img:
      "https://assets.tmecosys.com/image/upload/t_web767x639/img/recipe/ras/Assets/F688C2F6-86EC-46C4-B9C7-A6BA01DF7437/Derivates/32E3E72A-F786-406D-AF7F-B30980A9AC6C.jpg",
    desc: `Hot pepper sauce noodle, serving with soy bean and onion`,
  },
  {
    id: 9,
    title: "Doroyaki",
    category: "Japan",
    price: 3.99,
    img:
      "https://www.justonecookbook.com/wp-content/uploads/2011/10/Dorayaki-New-500x400.jpg",
    desc: `Red bean paste dessert, serving with honey.`,
  },
];
var categories = ["All"];
var catelem = {};
var elements = {};
var activeElements = [];

var menuelem = null;

const menuitemidp = "menuitem-";
window.onload = () => {
  document.getElementsByTagName("h2")[0].innerText = "Asian Kitchen's Menu";
  document.title = "Asian Kitchen"
  menu.forEach((vl) => {
    if (!categories.includes(vl.category)) categories.push(vl.category);
  });

  var btncontainer = document.getElementsByClassName("btn-container")[0];
  menuelem = document.getElementsByClassName("menu")[0];

  //We don't want to iterate through every menu item each time a category is clicked. It's inefficient.
  categories.forEach(function (cat) {
    catelem[cat] = menu.map(menuitem => menuitem.category == cat ? menuitem.id : null).filter(item => item!=null);
    var btn = document.createElement("button");
    btn.classList.add("btn-item", "border", "rounded","border-secondary");
    btn.innerText = cat;
    btn.setAttribute("onClick",`switchCategories("${cat}");`)
    btncontainer.appendChild(btn);
  });


  menu.forEach(function (menuitem) {
    var maindiv = document.createElement("div");
    maindiv.classList.add("col-5", "menu-item");
    maindiv.id = menuitemidp + menuitem.id;

    var foodphoto = document.createElement("img");
    foodphoto.src = menuitem.img;
    foodphoto.classList.add("photo");
    maindiv.appendChild(foodphoto);

    var header = document.createElement("div");
    header.classList.add("menu-title");

    var name = document.createElement("h4");
    name.innerText = menuitem.title;
    var price = document.createElement("h4");
    price.innerText = menuitem.price;
    header.appendChild(name);
    header.appendChild(price);
    maindiv.appendChild(header);

    var desc = document.createElement("p");
    desc.innerText = menuitem.desc;
    maindiv.appendChild(desc);

    elements[menuitem.id] = maindiv;
  });
  switchCategories("All");
}

function switchCategories(val) {
  removeActiveElements();
    if(val == "All") {
      var lastElemAmount = [0,null];
      for(var i = 1; i < categories.length; i++){
        console.log(lastElemAmount);
        lastElemAmount = addElementsToPage(categories[i], lastElemAmount);
      }
      return;
    }
    addElementsToPage(val);
}


//https://www.youtube.com/watch?v=sd-dK8OqtVU
function addElementsToPage(val,j = [0,null]) {
  var rowelem = j[1];
  var i = 0;
  for(; i < catelem[val].length; i++) {
    if(!((i + j[0]) % 2)){
      rowelem = document.createElement("div")
      rowelem.classList.add("section-center", "row", "menu-items");
      menuelem.appendChild(rowelem);
    }
    rowelem.appendChild(elements[catelem[val][i]]);
    activeElements.push(catelem[val][i]);
  }
  return [i + j[0], rowelem];
}

function removeActiveElements(){
  var rows = document.getElementsByClassName("row");
  console.log(activeElements);
  activeElements.forEach((elemid) => {
    document.getElementById(menuitemidp + elemid).remove();
  });
  activeElements = [];
  for(var i = 0; i < rows.length; i++) rows[i].remove();
}