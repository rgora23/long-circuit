#Long Circuit
#####An Android game designed around connecting nodes

### Fundamental rules of the game:
1. All nodes must be connected by one wire
2. A node can only have one wire attached to it
3. A node can connect to only one other node
4. Connected nodes must be the same color
5. Wires cannot overlap
6. The longer a wire is, the more points it is worth
7. A level is complete when all nodes are connected and the minimum score requirement is met

<br>
### Application requirements (overview):
* The user should be able to log in in order to track game progress and apply user-specific settings.
* The user can configure the game difficulty and other options. Harder difficulties have more colors and more nodes.
* Mathematically speaking, there must be an even number of nodes for each color provided by the level.
* The score is calculated on the fly and displayed as the user progresses through the level.
* Upon winning, the user can restart, go to the next level, resume the current level, or return to the main menu.
* The user can connect nodes by laying down wire from a node to its pair. This is emulated by the user dragging his finger from the starting node to the target node.
* High scores can be viewed. Although this is likely going to be a removed feature requirement in the future.
* There will be a level selection interface for the user to easily choose a level to play
* From the main menu, a "continue" button will allow the user to play the next unplayed level.

<br>
### Download instructions
Here are the steps to follow to get the project into your Android Studio:

1. clone the repo or download and extract the zip file to wherever you want it to live

  ```bash
  $ cd /location/of/your/android_studio/workspace
  $ git clone https://github.com/mourkeer/long-circuit.git PreferredAppDirectoryName
  ```
2. Launch android studio
3. Go to `File -> New -> Import Project...`
4. Choose the directory to the project:
`/location/of/your/android_studio/workspace/PreferredAppDirectoryName`
5. Click OK

##### You should now have the application imported properly and ready for dev

Things to try if the build fails:

- Remove the project, delete the directory, and follow steps 1-5 again
- In Android Studio, try `Build -> Clean`, then try to rebuild

<br>
### Other notes

The trello board for this project can be found [here][trello-url].

Please update this Readme.md file and add more information as it becomes relevant. There are lots of details and specs about the application that should be recorded here and stay up-to-date. This allows the group to use this Readme as the authority on what feaures are required and any changes to requirements that have been made.

You can use [Dillinger][dillinger-url] to write up changes and get the live markdown result.

[trello-url]: <https://trello.com/b/iRzwOuoV/long-circuit>
[dillinger-url]: <http://dillinger.io/>
