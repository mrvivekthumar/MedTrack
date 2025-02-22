import React from 'react';
import { View, Text, StyleSheet, ScrollView } from 'react-native';
import { LinearGradient } from 'expo-linear-gradient';

export default function Home() {
  return (
    <ScrollView style={styles.container}>
      <LinearGradient
        colors={['#4c669f', '#3b5998', '#192f6a']}
        style={styles.header}
      >
        <Text style={styles.welcomeText}>Welcome to MedTrack</Text>
        <Text style={styles.subtitle}>Your Medicine Management Hub</Text>
      </LinearGradient>

      <View style={styles.content}>
        <View style={styles.card}>
          <Text style={styles.cardTitle}>Today's Schedule</Text>
          <Text style={styles.cardText}>You have 3 medications due today</Text>
        </View>

        <View style={styles.card}>
          <Text style={styles.cardTitle}>Inventory Status</Text>
          <Text style={styles.cardText}>2 medications need refill</Text>
        </View>

        <View style={styles.card}>
          <Text style={styles.cardTitle}>Next Appointment</Text>
          <Text style={styles.cardText}>Dr. Smith - March 15, 2024</Text>
        </View>
      </View>
    </ScrollView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#f5f5f5',
  },
  header: {
    padding: 30,
    paddingTop: 60,
    borderBottomLeftRadius: 30,
    borderBottomRightRadius: 30,
  },
  welcomeText: {
    fontSize: 28,
    fontWeight: 'bold',
    color: '#ffffff',
    marginBottom: 10,
  },
  subtitle: {
    fontSize: 18,
    color: '#e0e0e0',
  },
  content: {
    padding: 20,
  },
  card: {
    backgroundColor: '#ffffff',
    borderRadius: 15,
    padding: 20,
    marginBottom: 20,
    shadowColor: '#000',
    shadowOffset: {
      width: 0,
      height: 2,
    },
    shadowOpacity: 0.25,
    shadowRadius: 3.84,
    elevation: 5,
  },
  cardTitle: {
    fontSize: 20,
    fontWeight: 'bold',
    color: '#192f6a',
    marginBottom: 10,
  },
  cardText: {
    fontSize: 16,
    color: '#666666',
  },
});