 # Pseudocode
1. Show a list of people
2. Let user select 2 people
3. Let A be person 1, and B be person 2
4. Function fillLineage(lineage[], person)
If person  has a parent, 
Then add that parent to the lineage[], fillLineage(lineage, person.parent)
If A/B don’t have parent, then do nothing
5. lineageA = array of A’s ancestors
6. lineageB = array of B’s ancestors
7. fillLineage(lineageA, A)
8. fillLineage(lineageB, B)
9. Let m = amount of equal elements(ancestors) in lineageA and lineageB
10. Let X = the remaining elements(ancestors) in lineageA
11. Let Y = the remaining elements(ancestors) in lineageB
12. If X = 0 or Y = 0
13. >Let genDiff = absolute value of the difference between X and Y
15. >If  genDiff is 1, then parent/child relationship, if X>Y, then Y is parent, if Y>X, then X is parent
16. >If genDiff = 2, then grandparent/grandchild relationship
17. >If genDiff => 3, then Y-2x great grandparent relationship
18. Else if X = Y 
19. >If X = 1, then A and B are siblings
20. >Else, X>1, then A and B are X-1 cousins
21. >Else if X = 1, and Y = 2, then B is A’s niece/nephew 
22. >Else vice versa
23. >Else if X = 1 and Y = 3, then B is A’s grandniece/nephew
24. >Else vice versa
25. >Else if X=1 and Y>3, then B is A’s Y-3x great grandniece/nephew or vice versa
26. >Else vice versa
27. Else // X must be > 1
28. >A and B are X-1 cousins
29. >If Y > X, then they are Y-X removed 
30. >Else vice versa
