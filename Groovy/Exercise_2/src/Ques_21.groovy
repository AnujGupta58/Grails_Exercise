// Ques 21  Consider the following map: Map m = [‘Computing’ : [‘Computing’ : 600, ‘Information Systems’ : 300], ‘Engineering’ : [‘Civil’ : 200, ‘Mechanical’ : 100], ‘Management’ : [‘Management’ : 800] ]
//              How many university departments are there?
//              How many programs are delivered by the Computing department?
//              How many students are enrolled in the Civil Engineering program?


Map College = ['Computing' : ['Computing' : 600, 'Information Systems' : 300],
               'Engineering' : ['Civil' : 200, 'Mechanical' : 100],
                'Management' : ['Management' : 800] ]

println "university departments in College = "+College.size()

println "programs delivered by the Computing department are "+College.Computing.size()