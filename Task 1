SELECT surname FROM Employee
WHERE experience = (select MAX(experience) 
                    from Employee WHERE experience NOT IN (select MAX(experience) 
                                                           from Employee));
