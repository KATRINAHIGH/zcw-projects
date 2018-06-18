
## Playlist

You love listening to music and just made a playlist of n songs on your MP3 Player named songs. Each song, si, in songs is ordered sequentially such that songs = [s0 , s1, …, sn−1] and 0 ≤ i < n.

The player has two buttons for switching between songs in the playlist, ↑ (up) and ↓ (down). If song si is currently playing, you can either press the ↑ button once to switch to song si−1  (i.e., the previous song), or the ↓ button once to switch to song si+1 (i.e., the next song). If you press ↓ while song sn−1 is playing, it will switch to song s0. Similarly, if you press ↑ while song s0 is playing, it will switch to song sn−1.

 

You're currently listening to song sk and decide you want to switch to some other song, q, in your playlist. What is the minimum number of button presses needed to switch from song sk to song q?

 

Note: The same song may appear multiple times in the playlist. It is guaranteed that song q is in the playlist.

 

Complete the playlist function in your editor. It has 3 parameters:

An array of n strings, songs, where the value of each element si corresponds to the song at index i in the playlist (where 0 ≤ i < n).
An integer, k, the index of song sk.
A string, q, the name of the song you wish to switch to.
It must return an integer denoting the minimum number of button presses needed to switch from song sk to song q.

 

### Constraints

1 ≤ n ≤ 100
0 ≤ k ≤ n−1
1 ≤ length of si ≤ 100
It is guaranteed that song q is in the playlist.
 

### Output Format

Your function must return an integer denoting the minimum number of button presses needed to switch from song sk to song q. This is printed to stdout by the locked stub code in your editor.

 

### Sample Input 1

```
String[] playlist = ['wheniseeyouagain','borntorun','nothingelsematters','cecelia'];
Integer startingIndex = 1;
String selection = 'cecelia'
Integer expected = 2;
Integer actual = music.selection(startingIndex, selection);
```

### Explanation 1

You start out listening to song sk=1 = "borntorun". By pressing the ↓ button 2 times, you can reach s3 = "cecelia". Thus, we return the number of button clicks, 2, as our answer.

 

### Sample Input 2

```
String[] playlist = ['dancinginthedark','rio','liveoak','liveoak'];
Integer startingIndex = 0;
String selection = 'liveoak'
Integer expected = 1;
Integer actual = music.selection(startingIndex, selection);
```

### Explanation 2

You start out listening to song sk=0 = "dancinginthedark". By pressing the ↑ button 1 time, you can reach s3 = "liveoak". Observe that we could also have pressed the ↓ button two times to switch to s2 = "liveoak", but two button presses would not be minimal. Thus, we return the number of button clicks, 1, as our answer.