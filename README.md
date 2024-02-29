# TermProject3060
# H1 Table Of Context 
1. Overview
2. Product Spec
3. Wireframes

# H1 Overview

# H2 Description
CineList is an all-encompassing movie watchlist application designed to revolutionize the way movie enthusiasts discover, organize, and engage with films. It offers a personalized platform where users can curate their watchlists, receive real-time notifications for movie availabilities in theaters or on streaming services, and access comprehensive viewing options to plan their movie-watching experiences. Moreover, the application fosters a vibrant community by allowing users to rate and review films, helping others navigate their cinematic journey. With its intuitive design and user-centric features, CineList is the ultimate destination for anyone looking to enhance their movie-watching routine, ensuring they never miss out on must-see films while connecting with a community of fellow movie lovers.

# H3 App Evaluation
- Category: Entertainment & Lifestyle
- Story: The core narrative of the application revolves around enhancing the movie-watching experience by providing users with tools to organize their watchlists, receive timely notifications about movie availabilities, and access detailed viewing options. It encourages users to explore new films tailored to their preferences, rate and review watched movies, and contribute to a community that values insightful movie discussions.
- Market: The target market for this application is broad, encompassing movie lovers of all ages worldwide. This includes casual viewers looking to streamline their movie nights, avid cinephiles seeking to deepen their cinematic knowledge, and social watchers interested in sharing experiences and recommendations with others. The global appeal of movies makes this app relevant across different cultures and languages, offering the potential for international expansion.
- Habit: The application aims to become a part of users' daily or weekly routines by facilitating the discovery of new movies and managing personal watchlists. Its features encourage regular interaction, such as checking for new recommendations, updating watchlists, and engaging with movie reviews. Over time, users may develop the habit of consulting the app before deciding on their next movie, making it an indispensable tool for movie planning and exploration.
- Scope: The scope of the application is ambitious, aiming to provide a one-stop solution for all aspects of movie discovery, organization, and community engagement. It integrates various functionalities, from personalized recommendations and real-time availability alerts to social features like ratings and reviews. The app seeks to offer enough depth to satisfy dedicated movie buffs while remaining accessible to casual viewers, balancing complexity with user-friendliness to cater to a wide audience.


# H4 Product Spec
# H5 User Stories
### Required Must-Have Stories:

1. **Search:**
   - Search for movies based on titles, genres, or actors.
   - The search results are to be relevant and quickly displayed.

2. **Review Option:**
   - Able to leave reviews and ratings for movies.
   - See reviews and ratings from other users to make informed decisions.

3. **Login and Sign In:**
   - Able to create an account and log in securely.
   - Watchlists and reviews to be associated with user account.

4. **Saved Option:**
   - The ability to save movies to user watchlist for future viewing.
   - Easily access user's saved watchlist.

5. **Categories:**
   - Movies to be categorized by genres, release dates, or popularity.
   - Explore curated lists or recommendations based on my preferences.

6. **Data Privacy & Security:**
   - Assurance that user personal data is secure and handled with privacy.
   - Control over who can view user's reviews and watchlists.

7. **Profile:**
   - Have a personalized profile where the user can manage their preferences.
   - Can track their movie-watching history and achievements.

### Optional Nice-to-Have Stories:

8. **Recommendation:**
   - Receive movie recommendations based on user watch history and preferences.
   - Discover hidden gems or new releases that align with user taste.

9. **Where to Watch:**
   - Information on where the user can watch a particular movie, whether in theaters or on streaming platforms.
   - Receive notifications when a movie from user watchlist becomes available on a streaming service.

# H6 Screens:
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


# H7 Navigation:
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
- Categorie >> Jumps to a Queue list.
- Rates and Reviews >> Goes to a text field to be modified.
- Settings >> Toggle settings

# H8 Wire Frames
[3024x4032.jpeg.892a42bfe6f74742b186d20d3ab4c984.large.zip](https://github.com/Java3060/TermProject3060/files/14234411/3024x4032.jpeg.892a42bfe6f74742b186d20d3ab4c984.large.zip)

# H9 Digital wireframs & Mockups
<img width="896" alt="Screenshot 2024-02-11 at 6 12 01 PM" src="https://github.com/Java3060/TermProject3060/assets/85651849/73df479e-d392-4419-8300-ce1e24ba56bd">


# Schema
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
   
  
