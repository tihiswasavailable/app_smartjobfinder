package com.example.smart_job_finder;
import android.app.Application;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JobList extends Application {
    private static List<Job> jobList = new ArrayList<>();

    public JobList() {
        fillJobList();
    }

    private void fillJobList() {
        jobList.addAll(
                Arrays.asList(
                        new Job(R.drawable.amazon, "Amazon Backend Dev", "An Amazon backend developer is responsible for designing, developing, and maintaining the server-side systems and infrastructure that power Amazon's various services and applications. This role typically involves working with large-scale distributed systems, databases, and cloud technologies to ensure the reliability, scalability, and performance of Amazon's backend services. Amazon backend developers collaborate with cross-functional teams to create innovative solutions that enhance the customer experience and drive the success of Amazon's e-commerce, cloud computing, and other products and services. This role requires expertise in programming languages, such as Java, Python, or C++, and a deep understanding of backend technologies and best practices.", "Graz", R.drawable.ic_heart, "amazon.application@mail.com"),
                        new Job(R.drawable.google_logo, "Data Science", "A Google data scientist is a professional who leverages data to extract insights, patterns, and meaningful information, contributing to data-driven decision-making at Google. They utilize statistical analysis, machine learning, and data mining techniques to analyze large datasets and solve complex problems. Google data scientists work on a variety of projects across the company, including improving search algorithms, enhancing advertising targeting, and optimizing user experiences. They also collaborate with cross-functional teams to develop data-driven solutions that enhance Google's products and services. This role demands strong analytical and programming skills, proficiency in data manipulation and visualization tools, and a deep understanding of statistical concepts and machine learning algorithms. ", "Vienna", R.drawable.ic_heart, "application@google.com"),
                        new Job(R.drawable.microsoft, "Fullstack Dev .NET", "A Fullstack .NET Developer is a critical member of our software development team responsible for designing, developing, and maintaining end-to-end web applications and software solutions using Microsoft's .NET framework. As a Fullstack .NET Developer, you will work on both frontend and backend aspects of our projects to create high-quality, scalable, and user-friendly applications", "Linz", R.drawable.ic_heart, "application@microsoft.com"),
                        new Job(R.drawable.facebook, "React Frontend Dev", "A React Frontend Developer is responsible for creating responsive, visually appealing user interfaces using the React library. They collaborate with designers, integrate APIs, and ensure cross-browser compatibility and performance optimization. ", "Munich", R.drawable.ic_heart, "application@meta.com"),
                        new Job(R.drawable.apple, "Swift Frontend Dev ", "An Apple Swift Developer is responsible for building software applications and solutions for Apple's platforms (iOS, macOS, watchOS, and tvOS) using the Swift programming language. They design and implement user-friendly, high-performance applications, ensuring a seamless user experience across Apple devices. ", "Vienna", R.drawable.ic_heart, "info@apple.com"),
                        new Job(R.drawable.linkedin, "Marketing and Management", "A LinkedIn Marketing and Management Specialist is responsible for optimizing LinkedIn profiles, developing content strategies, engaging with professional networks, managing advertising campaigns, and monitoring analytics to enhance brand visibility and professional networking. ", "Graz", R.drawable.ic_heart,"application@linkedIn.com"),
                        new Job(R.drawable.netflix, "Project Manager", "A Netflix Project Manager is responsible for overseeing and managing various projects within the company, ensuring they are completed on time and within budget. They coordinate cross-functional teams, set project goals, and deliver high-quality content or technical solutions for the streaming platform. ", "Graz", R.drawable.ic_heart,"application@netflix.com"),
                        new Job(R.drawable.x_logo, "Customer Service", "A Twitter Customer Service Representative is responsible for providing assistance and support to Twitter users, addressing their inquiries, issues, and concerns. They engage with users through various communication channels to ensure a positive experience, resolve problems, and uphold the platform's policies and standards. ", "Vienna", R.drawable.ic_heart, "application@x.com")
                )
        );
    }

    public static List<Job> getJobList() {
        return jobList;
    }

    public static void setJobList(List<Job> jobList) {
        JobList.jobList = jobList;
    }
}
