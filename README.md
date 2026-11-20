# 🍀 Lucky Box Mod

## About the Mod

Lucky Box is a Minecraft Fabric mod developed using Java. It introduces custom gameplay elements, including a Lucky Coin item and a Lucky Block that brings excitement and unpredictability to the Minecraft world. When broken, the Lucky Block can generate random rewards such as diamonds and gold, or trigger unexpected events like spawning zombies, summoning lightning, and producing TNT. This project was developed to explore Minecraft modding, Java programming, Fabric API, item and block registration, and event handling.

## Minecraft and Development Versions

- **Minecraft Version:** 26.3
- **Java Version:** 25.0.5 (Eclipse Adoptium)
- **Gradle Version:** 9.8.2
- **Mod Loader:** Fabric
- **Programming Language:** Java

## Features

### 🪙 Custom Lucky Coin
- A custom item introduced into Minecraft.
- Adds a unique collectible element to the game.

### 🍀 Lucky Block
- A custom block that triggers random outcomes when broken.
- Creates unpredictable gameplay experiences.

### 💎 Random Rewards
The Lucky Block can reward players with valuable items, including:
- Diamonds
- Gold
- TNT

### ⚡ Random Events
Breaking the Lucky Block can also trigger unexpected events:
- **Zombie Spawn:** Summons a zombie near the player.
- **Lightning Strike:** Creates a lightning strike.


### 🎲 Stretch Goal
Implemented a random outcome system for the Lucky Block, combining valuable rewards and unexpected events. Players never know whether breaking a Lucky Block will bring them diamonds and gold or an unexpected challenge!

## Screenshots

### 1. Custom Lucky Coin

![Lucky Coin](screenshots/lucky_coin.png)

### 2. Custom Lucky Block

![Lucky Block](screenshots/lucky_block.png)

### 3. Random Events and Rewards

![Stretch Goal](screenshots/stretch-goal.png)

## Installation

1. Install Minecraft Java Edition.
2. Install Fabric Loader compatible with Minecraft 26.3.
3. Download the Lucky Box Mod JAR file.
4. Locate your Minecraft installation's `mods` folder.
5. Place the downloaded mod JAR inside the `mods` folder.
6. Launch Minecraft using the Fabric profile.

## Building from Source

To build the mod locally:

1. Clone the repository:

   ```bash
   git clone https://github.com/Anum-Damudi/lucky_box.git
   ```

2. Open the project directory:

   ```bash
   cd lucky_box
   ```

3. Build the mod:

   ```bash
   .\gradlew.bat build
   ```

4. Find the compiled JAR inside:

   ```text
   build/libs/
   ```

   Use the regular `.jar` file, not the `-sources.jar` file.

## Technologies Used

- Java
- Minecraft Java Edition
- Fabric Mod Loader
- Fabric API
- Gradle
- IntelliJ IDEA / Visual Studio Code

## Developer

**Developed by Anum**

A Minecraft modding project created to explore Java programming, game development, and the Fabric modding ecosystem.