<!DOCTYPE html>
<html>

<head>
<%@ include file="Navbar.jsp"%>
    <link rel="stylesheet" type="text/css" href="video.css" />

    <title>Video Slider</title>
    <style>
        /* Add this style to make the video cover the whole screen */
        body, html {
            height: 100%;
            margin: 0;
            overflow: hidden; /* Prevent scrollbars */
        }

        section {
            position: absolute;
            top: 0;
            left: 0;
            width: 100%;
            height: 100%;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
        }

        section video {
            width: auto;
            height: 100%;
            max-width: 56.25vw; /* 9:16 aspect ratio (100 / 9 * 16) */
            object-fit: cover;
        }

        .navigation {
            list-style: none;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
        }

        .navigation li {
            margin: 0 10px;
            cursor: pointer;
        }

        .navigation li img {
            width: 50px; /* Adjust the thumbnail width as needed */
            height: auto;
            border-radius: 4px;
        }
    </style>
</head>

<body>
    <section>
        <video id="slider" autoplay loop controls>
            <source src=" /vid1" type="video/mp4">
        </video>
        <ul class="navigation">
            <li onclick="videoUrl('/vid1')"><img src="imgvid/thumb1.jpg"></li>
            <li onclick="videoUrl('/vid2')"><img src="imgvid/thumb2.jpeg"></li>
            <li onclick="videoUrl('/vid3')"><img src="imgvid/thumb3.avif"></li>
            <li onclick="videoUrl('/vid4')"><img src="imgvid/thumb4.jpg"></li>
            <li onclick="videoUrl('/vid5')"><img src="imgvid/thumb4.jpg"></li>
            <li onclick="videoUrl('/vid6')"><img src="imgvid/thumb4.jpg"></li>
            <li onclick="videoUrl('/vid7')"><img src="imgvid/thumb4.jpg"></li>
            <li onclick="videoUrl('/vid8')"><img src="imgvid/thumb4.jpg"></li>
            <li onclick="videoUrl('/vid9')"><img src="imgvid/thumb4.jpg"></li>
            <li onclick="videoUrl('/vid10')"><img src="imgvid/thumb4.jpg"></li>
            <li onclick="videoUrl('/vid11')"><img src="imgvid/thumb4.jpg"></li>
            <li onclick="videoUrl('/vid12')"><img src="imgvid/thumb4.jpg"></li>
            <li onclick="videoUrl('/vid13')"><img src="imgvid/thumb4.jpg"></li>
            <li onclick="videoUrl('/vid14')"><img src="imgvid/thumb4.jpg"></li>
        </ul>
    </section>
    <script type="text/javascript">
        function videoUrl(hmmmmm) {
            document.getElementById("slider").src = hmmmmm;
            document.getElementById("slider").play(); // Start playing the new video
        }
    </script>
</body>

</html>