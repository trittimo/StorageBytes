# StorageBytes
StorageBytes is a mod dedicated to highly programmable item transfer and inventory management. It adds only one item -- the Inventory Linker -- which can be used to create inventory networks. Inventory networks can be as simple or complex as the player wants them to be. A simple network might do something such as move items in one chest to items in another chest without a need for pipes or hoppers connecting them. A more complex network might distribute items from one chest into multiple others, but only when certain conditions are met (i.e. one chest is low on a certain type of item, or a redstone signal is provided to one of the inventories).

## Index
1. [Getting Started](#getting-started)
2. [Inventory Linker Modes](#inventory-linker-modes)
3. [Creating Networks](#creating-networks)
4. [Managing Inventories And Conditions](#managing-inventories-and-conditions)

## Getting Started
First craft yourself an Inventory Linker; this will be your key to the rest of the mod, but no information is stored on the Inventory Linker itself. You can safely lose your linker and craft a new one if necessary without your networks being affected in any way. Right clicking with your linker in hand will open the network management GUI, which is explained in more detail below. It should be noted now that in order to link inventories together and do anything with them, you will need to give your Inventory Linker power. This is done by putting Ender Pearls into the slot at the top left of the management GUI. A single Ender Pearl will be converted into 32 EPP (Ender Pearl Power). The usage of EPP is discussed more in [Managing Inventories And Conditions](#managing-inventories-and-conditions).

## Inventory Linker Modes
The Inventory Linker has two modes, management and linking.

In management mode, you can (unsurprisingly) manage your inventory networks. Using the linker will open a GUI which displays a list of all your created networks. You can search for a specific network using the textbox at the top of the GUI. Left clicking on one of these networks will allow you to disable, delete, or rename it. By disabling a network, you prevent it from moving any items from inventories. You can always enable a disabled network at a later point in time, allowing items to be transfered again. Deleting a network is permanent and should only be done when you are certain you will no longer need it.

In management mode, you can also indicate which network you are currently working on by right-clicking on said network. This will change the mode of your linker into linking mode. In linking mode, you are able to add/remove inventories to the current network, manage transfer conditions, and change the names of certain inventories. We will discuss this more below in [Creating Networks](##Creating Networks).

One last thing to note is that all networks are linked to the player who made them, and they cannot by default be managed by other players. You can however add players who are allowed to view and manage your networks by selecting the network and clicking the Managers tab at the top right. From here you can add and remove players by username, or specify "Open to All" to allow everyone on the server to manage your networks.

## Creating Networks
In order to make a network, simply click the "+" button at the bottom of the management GUI. This will open a new management tab for your network, where you can give it a name and add additional managers if you so wish. If you do not give the network a (valid) name and hit "Accept" at the bottom of the GUI, the network will not be created.

On creating your network, you will notice that it has a unique integer ID associated with it by hovering over the networks name in the mangement GUI, or by left clicking on it and viewing the ID in the left corner of the network screen. This ID will allow you to distinguish between networks that have the same name.

## Managing Inventories And Conditions
Once you have created a network, select it in the management GUI by right clicking on it. Your inventory selector will be put into linking mode, wherein you can use the linker on a block and it will add the block's coordinates to your network. It is important to note that the block itself is not added to the network -- only the coordinates. This allows you to remove an inventory from the world and replace it with a new one (e.g. if you want to replace an iron chest with a diamond one). It also allows you to plan your builds in advance and create your item network before you get the materials for your inventories.

Having added the blocks you want to the network, open your management GUI and look at the inventories listed there. If you click on one, it will bring up a screen listing the 