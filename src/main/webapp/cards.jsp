<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="css/card.css">
 <link rel="stylesheet" href="css/index.css">
  <title>Advisors</title>
</head>
<body>
  <div class="cards">
    <h1>ADVISORS!</h1>
    <div class="cards__container">
      <div class="cards__wrapper">
        <ul class="cards__items">
          <li>
            <img src="/image1.jpeg" alt="Advisor Image 1">
            <p>- Sr Consultant and Placement Incharge</p>
            <p class="label">G Srinivas</p>
            <a href="/course1">Learn More</a>
          </li>
          <li>
            <img src="/image2.png" alt="Advisor Image 2">
            <p>- Sr Consultant UNICEF</p>
            <p class="label">Srilatha Sivalenka</p>
          </li>
        </ul>
        <ul class="cards__items">
          <li>
            <img src="/annasirimg.jpeg" alt="Advisor Image 3">
            <p>- CEO Raedon tech</p>
            <p class="label">Venkatesh</p>
          </li>
          <li>
            <img src="/sircard.JPG" alt="Advisor Image 4">
            <p>- Psychologist</p>
            <p class="label">Amarnath jagarlapudi</p>
          </li>
        </ul>
      </div>
    </div>
  </div>

  <script type="module">
    import React from 'https://unpkg.com/react@17/umd/react.development.js';
    import { Link } from 'https://unpkg.com/react-router-dom@5/umd/react-router-dom.min.js';

    function CardItem(props) {
      return (
        <>
          <li className='cards__item'>
            <Link className='cards_item_link' to={props.path}>
              <figure className='cards_item_pic-wrap' data-category={props.label}>
                <img
                  className='cards_item_img'
                  alt='Travel Image'
                  src={props.src}
                />
              </figure>
              <div className='cards_item_info'>
                <h5 className='cards_item_text'>{props.text}</h5>
              </div>
            </Link>
          </li>
        </>
      );
    }

    export default CardItem;
  </script>
</body>
</html>