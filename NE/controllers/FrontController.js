class FrontController{
    static home = (req, res) => {
        res.send('Namaste World!')
    }
    static about = (req, res) =>{
        res.send("What are in your about?")
    }
    static contact = (req, res) =>{
        res.send("Nothing in the contact section.")
    }

}
module.exports = FrontController