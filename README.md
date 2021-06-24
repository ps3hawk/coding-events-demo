# coding-events-demo

//
1)The purpose of this app is to create, save, edit and delete events from our database. 

2)Currently the app can create event categories. When creating an event, we can select which category we want from a dropdown menu. 
There is a form to input the name and another for a description. When submitted our events are being saved in a MySQL database. We also can create and add tags to our events. 

3)This app is incomplete. The tags can be created but not deleted. Also, there is no functionality linked to the tags. 
We should at a minimum be able to see all events sharing a tag. It would be good to add a Person class to keep track of people attending our event. 
This class would extend our AbrstractEntity class to keep our code DRY. Extending will generate a Person Id, equals & hash code methods, as well as our “getter” for each person. 
The person class would have a name field. It may be helpful to have an age field as well. Verifying the age is important in case some events are +21. 
Also, the age field would give us the ability to project +21 attendees for all ages events with alcohol being sold. 
This functionality will also allow us to track the average age of crowds. 
If food is being provided it would also be a good Idea to have a “dietary requirements” field. This would be helpful for any allergies to be cautious of and vegetarian preferences.
//
