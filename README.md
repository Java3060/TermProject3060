# TermProject3060
# H1 Table Of Context 
1. Overview
2. Product Spec
3. Wireframes

# H1 Overview

Description
Tracks movies/shows a user watches and recommends new shows/movies based off their preferences

App Evaluation
Category: Entertainment
Story: Analyzes users movie taste, and refers them to other movies with similar characteristics. The user can also add ratings to movies to help other users.
Market: Any individual could choose to use this app, and to keep it a safe environment, 
Habit: This app could be used as often or unoften as the user wanted depending on how often they watch movies, and what exactly they're looking for.
Scope: First we would start with asking questions about what type of movies the user likes to watch, then perhaps this could evolve into a movie sharing application as well to broaden its usage. Large potential for use with Netflix, Hulu, or other movie streaming applications.

# H2 Description
CineList is an all-encompassing movie watchlist application designed to revolutionize the way movie enthusiasts discover, organize, and engage with films. It offers a personalized platform where users can curate their watchlists, receive real-time notifications for movie availabilities in theaters or on streaming services, and access comprehensive viewing options to plan their movie-watching experiences. Moreover, the application fosters a vibrant community by allowing users to rate and review films, helping others navigate their cinematic journey. With its intuitive design and user-centric features, CineList is the ultimate destination for anyone looking to enhance their movie-watching routine, ensuring they never miss out on must-see films while connecting with a community of fellow movie lovers.

# H3 App Evaluation
- Category: Entertainment & Lifestyle
- Story: The core narrative of the application revolves around enhancing the movie-watching experience by providing users with tools to organize their watchlists, receive timely notifications about movie availabilities, and access detailed viewing options. It encourages users to explore new films tailored to their preferences, rate and review watched movies, and contribute to a community that values insightful movie discussions.
- Market: The target market for this application is broad, encompassing movie lovers of all ages worldwide. This includes casual viewers looking to streamline their movie nights, avid cinephiles seeking to deepen their cinematic knowledge, and social watchers interested in sharing experiences and recommendations with others. The global appeal of movies makes this app relevant across different cultures and languages, offering the potential for international expansion.
- Habit: The application aims to become a part of users' daily or weekly routines by facilitating the discovery of new movies and managing personal watchlists. Its features encourage regular interaction, such as checking for new recommendations, updating watchlists, and engaging with movie reviews. Over time, users may develop the habit of consulting the app before deciding on their next movie, making it an indispensable tool for movie planning and exploration.
- Scope: The scope of the application is ambitious, aiming to provide a one-stop solution for all aspects of movie discovery, organization, and community engagement. It integrates various functionalities, from personalized recommendations and real-time availability alerts to social features like ratings and reviews. The app seeks to offer enough depth to satisfy dedicated movie buffs while remaining accessible to casual viewers, balancing complexity with user-friendliness to cater to a wide audience.


# H2 Product Spec
# H3 User Stories
-Required Must have stories:
-Search
-Review option
-Login and Sign in
-Saved option
-Categories
-Data Privacy & Security
-Profile

-Optional Nice-to-have Stories:
-Recommendation
-Where to watch


# H3 Screens:
1. Home Screen (This is where all the recommended, most popular, and coming soon will be)
2. Log-in screen (This will allow users to log in to their account)
3. Sign Up Screen (This will allow users to make their account)
4. Catalog Screen (This will show all the movies out and available to watch)
5. Categories Screen (This will allow users to pick from categories to choose the type of movies that they like best)
6. Rate and Review Screen (This will allow users to give feedback about a movie they watched)
7. Settings (This will allow users to customize their information, and other general information)
8. Saved (This shows all the saved movies they will want to watch later on)
9. Search (This is the search engine for searching for movies)
10. Movie Selection (This will show the name, description, ratings, and where to watch the movie)
11. Profile Screen (Allows users to upload a photo and fill in information that is interesting to them and others)


# H3 Navigation:
- Home
- Saved
- Catalog
- Categories
- Rates and Reviews
- Settings

Flow Navigation (Screen to Screen):
- Home >>> To the recommended, top picks page.
- Saved >> Jumps to a list of movies that were saved by the user.
- Catalog >> Goes to a list of movies in Alphabetical Order.
- Categories >> Jumps to a Queue list.
- Rates and Reviews >> Goes to a text field to be modified.
- Settings >> Toggle settings

# H3 Wire Frames
[3024x4032.jpeg.892a42bfe6f74742b186d20d3ab4c984.large.zip](https://github.com/Java3060/TermProject3060/files/14234411/3024x4032.jpeg.892a42bfe6f74742b186d20d3ab4c984.large.zip)

# H3 Digital wireframs & Mockups
<img width="896" alt="Screenshot 2024-02-11 at 6 12 01 PM" src="https://github.com/Java3060/TermProject3060/assets/85651849/73df479e-d392-4419-8300-ce1e24ba56bd">

# H3 Interactive Prototype

# Schema

## List of network requests by screen

- Home Feed Screen
(Read/GET) Query all movies that is recommended for user
(Create/POST) Create a new comment on a movie

- Saved
  (Read/GET) Query all movies that is saved by the user

- Categories
  (Read/GET) Query all categories and all movies in a specific category when that category is clicked on

  - Create Comment Screen
  (Create/POST) Create a new comment

  - Settings Screen
  (Update/PUT) Update user profile image
  (Update/PUT) Update user email and notification preferences
  (Update/PUT) Update user email or phone number

### Existing API endpoiints

| HTTP Verb | Endpoint | Description             |
|-----------|----------|-------------------------|
| POST      | String   | Add favorite            |
| POST      | String   | Add to Watchlist        |
| POST      | String   | Add friend              |
| POST      | String   | Add Review              |
| GET       | String   | List of Favorite Movies |
| GET       | String   | List of recommendations |
| GET       | String   | Movie Categories        |
| GET       | String   | List of friends         |
| GET       | String   | List of movie reviews   |
| DELETE    | String   | Delete Review           |


  

## Models
### User 

   | Property      | Type     | Description         |
   | ------------- | -------- | --------------------|
   | UserID        | Number   | User ID Number      |
   | Email         | String   | Email Address       |
   | FriendsList   | Array    | List of Friends     |
   
### Movie 

   | Property      | Type     | Description         |
   | ------------- | -------- | --------------------|
   | MovieID       | Number   | Movie ID Number     |
   | Title         | String   | Movie Title         |
   | Genre         | String   | Movie Genre         |
   | Release date  | DateTime | Movie Release Date  |
   | Overview      | String   | Movie Overview      |
   | Rating        | Number   | Movie Rating 1-10   |
   | TMDBID        | Number   | Movie Databse integration ID|

   ### Watchlist 

   | Property      | Type     | Description         |
   | ------------- | -------- | --------------------|
   | WListID       | Number   | Watchlist Movie ID #|
   | MovieID       | Number   | Movie ID Number     |
   | UserID        | Number   | User ID Number      |
   | Watched       | Boolean  | Watched/Unwatched   |
   | AddedDate     | DateTime | Date Movie added to list  |

   ### Reccomendations 

   | Property      | Type     | Description         |
   | ------------- | -------- | --------------------|
   | RecID         | Number   | Reccomendation ID # |
   | MovieID       | Number   | Movie ID Number     |
   | UserID        | Number   | User ID Number      |   
   | RecDate       | DateTime | Date Movie added to list |

   ### Review 

   | Property      | Type     | Description         |
   | ------------- | -------- | --------------------|
   | ReviewID      | Number   | Review ID #         |
   | MovieID       | Number   | Movie ID Number     |
   | UserID        | Number   | User ID Number      |   
   | RevDate       | DateTime | Date Review was made| 
   | Rating        | Number   | Movie Rating 1-10   |
   | Comments      | Array    | Review Comments     |
   
   ### Friends 

   | Property      | Type     | Description         |
   | ------------- | -------- | --------------------|
   | SocialID      | Number   | Social Interaction ID# |
   | FriendCount   | Number   | Number of Friends   |
   | UserID        | Number   | User ID Number      |   
   | RequestSent   | Number   | Amount of friend request |
   | Status        | String   | Pending,Accepted,Declined|  
   | FriendList    | Array    | List of Friends     |
   
  
