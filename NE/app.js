const express = require('express')
const FrontController = require('./controllers/FrontController')
const PracticeController = require('./controllers/PracticeController')
const RendringController = require('./controllers/RendringController')
const app = express()
const port = 5000

// basic routing
// app.get('/', (req,res) => {
//   res.send("Hello World!")
// })

// setup EJS
app.set('view engine','ejs')

// setup static files
app.use(express.static('public'))

// FrontController (routing)
app.get('/',FrontController.home)
app.get('/about', FrontController.about)
app.get('/contact', FrontController.contact)

// PracticeController
app.get('/practice', PracticeController.pw)

// RenderingController
app.get('/website', RendringController.web)







// server creating
app.listen(port, () => {
  console.log(`Server is running on localhost: ${port}`)
})

