const baseURL = `${window.location.origin}`


// INSPIRATIONAL QUOTES CODE

const message = document.querySelector("#message")

function addQuote(event) {
    event.preventDefault();
    const inputField = document.querySelector("input");
    const ul = document.querySelector("ul");
    const quote = document.createElement("li");
    const quoteText = document.createElement("span");
    quoteText.textContent = inputField.value;
    quote.appendChild(quoteText);
    const deleteBtn = document.createElement("button");
    deleteBtn.textContent = "X";
    deleteBtn.addEventListener('click',deleteQuote);
    quote.appendChild(deleteBtn);
    ul.appendChild(quote);
    inputField.value = " ";
}


const form2 = document.querySelector("#quotes");
form2.addEventListener('submit', addQuote)


function deleteQuote(event) {
    event.target.parentNode.remove();
    message.textContent = "Quote deleted!"
    
}

// INSPIRATIONAL STORY CARDS CODE

const storyContainer = document.querySelector('#stories-container')
const form = document.querySelector('#story-form')



function createStoryCard(story) {
    const storyCard = document.createElement('div')
    storyCard.classList.add('story-card')

    storyCard.innerHTML = `<img alt='story cover image' src=${inspo.imageURL} class="story-cover-image"/>
    <p class="story-title">${story.title}</p>
    <div class="txt-container">
        <p class="story-text">${story.text}</p>  
    </div>
    <button onclick="deleteStory(${story.id})">delete</button>
    `


    storyContainer.appendChild(storyCard)
}



function displayStories(arr) {
    storyContainer.innerHTML = ``
    for (let i = 0; i < arr.length; i++) {
        createStoryCard(arr[i])
    }
}

const storyCallback = ({data: stories}) => displayStories(stories)


const errCallback = err => console.log(err)

const getAllStories = () => axios.get(`${baseURL}/api/inspo`).then(storyCallback).catch(errCallback)
const createStory = body => axios.post(`${baseURL}/api/inspo`, body).then(storyCallback).catch(errCallback)
const deleteStory = id => axios.delete(`${baseURL}/api/inspo/${id}`).then(storyCallback).catch(errCallback)


function submitHandler(e) {
    e.preventDefault()

    let title = document.querySelector('#title')
    let text = document.querySelector('#text')
    let imageURL = document.querySelector('#img')

    let bodyObj = {
        title: title.value,
        text: text.value, 
        imageURL: imageURL.value
    }
    
    createStory(bodyObj)
    

    title.value = ''
    text.value = ''
    imageURL.value = ''
}


form.addEventListener('submit', submitHandler)


getAllStories()