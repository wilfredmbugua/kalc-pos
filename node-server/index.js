const express = require('express');
const app = express();
app.use(express.json());
app.post('/mpesa/callback', (req,res) => { console.log('callback', req.body); res.json({ResultCode:0}); });
app.get('/', (req,res)=>res.send('KALC callback server'));
app.listen(process.env.PORT||3000, ()=>console.log('listening'));
