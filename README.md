<h1 align="center">Motive - Android App</h1>

<p align="center">
  Motive is an Android application that helps users create and join events, connect with other users, and manage personal game events with ease. The app integrates Firebase Firestore for real-time data storage and retrieval and provides an interactive map to display games.
</p>

---

## Table of Contents
- <a href="#project-overview">Project Overview</a>
- <a href="#features">Features</a>
- <a href="#technologies">Technologies</a>
- <a href="#setup-and-installation">Setup and Installation</a>
- <a href="#usage">Usage</a>
- <a href="#contributing">Contributing</a>

## <a id="project-overview">Project Overview</a>
Motive enables users to create, manage, and join game events in various locations, complete with filtering options based on experience, age, and gender preferences. The app uses Google Maps to display events, Firebase Authentication for secure login, and Firestore for real-time event management.

## <a id="features">Features</a>
<ul>
  <li><strong>Create Game Events</strong>: Users can create game events specifying location, experience level, and participant preferences.</li>
  <li><strong>Join Game Events</strong>: Allows users to join games based on real-time data from Firebase Firestore.</li>
  <li><strong>Map View</strong>: Interactive Google Map showing available games as markers with clustering.</li>
  <li><strong>User Authentication</strong>: Firebase Authentication for secure user login and registration.</li>
  <li><strong>Event Management</strong>: Host, edit, and manage game events.</li>
  <li><strong>Push Notifications</strong>: Manage notifications for game updates (optional).</li>
</ul>

## <a id="technologies">Technologies</a>
<ul>
  <li><strong>Android</strong>: Native Android development with Java.</li>
  <li><strong>Firebase</strong>:
    <ul>
      <li>Firestore: Used for real-time data storage.</li>
      <li>Firebase Authentication: User management.</li>
    </ul>
  </li>
  <li><strong>Google Maps API</strong>: Interactive map displaying events.</li>
  <li><strong>JUnit/Jasmine</strong>: Unit testing for business logic.</li>
</ul>

## <a id="setup-and-installation">Setup and Installation</a>
<ol>
  <li>Clone the repository:
    <pre><code>git clone https://github.com/aeimaan/Motive.git</code></pre>
  </li>
  <li>Open the project in Android Studio.</li>
  <li>Connect the project to Firebase:
    <ul>
      <li>Follow the steps to link the Firebase project in Android Studio.</li>
      <li>Ensure Google Maps API key is set up in the <a href="https://console.cloud.google.com/">Google Maps API console</a> and added to your project.</li>
    </ul>
  </li>
  <li>Sync Gradle and run the app on an emulator or physical device.</li>
</ol>

## <a id="usage">Usage</a>
<ul>
  <li><strong>Creating a Game</strong>: After logging in, navigate to the "Create Game" section, fill out the game details (location, type, participants), and save it.</li>
  <li><strong>Joining a Game</strong>: Browse the map for available games, select a game marker, and join the game by clicking the "Join Game" button.</li>
  <li><strong>Hosting and Editing</strong>: Users hosting a game can edit game details or remove the event.</li>
</ul>

## <a id="contributing">Contributing</a>
Contributions are welcome! To contribute:
<ol>
  <li>Fork the repository.</li>
  <li>Create a new feature branch: <pre><code>git checkout -b feature-branch</code></pre></li>
  <li>Commit your changes: <pre><code>git commit -am 'Add new feature'</code></pre></li>
  <li>Push the branch: <pre><code>git push origin feature-branch</code></pre></li>
  <li>Open a Pull Request.</li>
</ol>

