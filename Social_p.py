import csv

def build_Table(filename):
    sentiment_score = {} # dictionary to store the sentiment scores
    with open(filename, 'r') as csvfile: # open the file
        reader = csv.reader(csvfile)
        for row in reader: # read the file row by row
            sentiment_score[row[0]] = float(row[1]) # store the sentiment score
    return sentiment_score


def ranking(score):
    #based on sentinamnet score, return the ranking out of 5
    if score < -5:
        return 1
    elif -5 <= score < -1:
        return 2
    elif -1 <= score < 1:
        return 3
    elif 1 <= score < 5:
        return 4
    else:
        return 5
    

def count_scores(sentiment, review_file):
    total_score = 0.0
    with open(review_file, 'r') as file: #open the file
        for line in file: #read the file line by line
            words = line.split()
            for word in words:
                if word in sentiment: #if the word is in the sentiment dictionary 
                    total_score += sentiment[word] #add the sentiment score to the total score
                    print(f"{word}: {sentiment[word]:.2f}, {total_score:.2f}") #print the word and the sentiment score
    return total_score


def main():
    sentiment = build_Table('socialsent.csv') #build the sentiment dictionary 
    review_file = input('Enter the name of the review file: ') #ask the user for the review file
    score = count_scores(sentiment, review_file) #count the score of the review file
    ranking_review = ranking(score) #get the ranking out of 5 from review file
    print()
    print(f'{review_file} score: {score:.2f}') #print the score of the review file
    print(f'{review_file} Stars: {ranking_review:.2f}') #print the ranking out of 5 of the review file

main()



