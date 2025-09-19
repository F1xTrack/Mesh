import React from 'react';
import {
  SafeAreaView,
  ScrollView,
  StatusBar,
  StyleSheet,
  Text,
  useColorScheme,
  View,
} from 'react-native';
import {NativeModules} from 'react-native';

const {Environments} = NativeModules;

const App = () => {
  const isDarkMode = useColorScheme() === 'dark';

  const backgroundStyle = {
    backgroundColor: isDarkMode ? '#000000' : '#FFFFFF',
    flex: 1,
  };

  return (
    <SafeAreaView style={backgroundStyle}>
      <StatusBar
        barStyle={isDarkMode ? 'light-content' : 'dark-content'}
        backgroundColor={backgroundStyle.backgroundColor}
      />
      <ScrollView
        contentInsetAdjustmentBehavior="automatic"
        style={backgroundStyle}>
        <View style={styles.container}>
          <Text style={styles.title}>Дневник МЭШ</Text>
          <Text style={styles.subtitle}>Московская электронная школа</Text>
          <Text style={styles.version}>Версия: 3.64.24</Text>
          {Environments && (
            <View style={styles.environments}>
              <Text style={styles.sectionTitle}>Конфигурация:</Text>
              <Text style={styles.configText}>
                RuStore Push Project ID: {Environments.RUSTORE_PUSH_PROJECT_ID}
              </Text>
              <Text style={styles.configText}>
                AppMetrica API Key: {Environments.APPMETRICA_API_KEY}
              </Text>
            </View>
          )}
        </View>
      </ScrollView>
    </SafeAreaView>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    padding: 20,
  },
  title: {
    fontSize: 28,
    fontWeight: 'bold',
    color: '#2E7D32',
    marginBottom: 10,
    textAlign: 'center',
  },
  subtitle: {
    fontSize: 18,
    color: '#4CAF50',
    marginBottom: 20,
    textAlign: 'center',
  },
  version: {
    fontSize: 16,
    color: '#666666',
    marginBottom: 30,
    textAlign: 'center',
  },
  environments: {
    backgroundColor: '#F5F5F5',
    padding: 15,
    borderRadius: 8,
    width: '100%',
  },
  sectionTitle: {
    fontSize: 18,
    fontWeight: 'bold',
    color: '#333333',
    marginBottom: 10,
  },
  configText: {
    fontSize: 14,
    color: '#666666',
    marginBottom: 5,
    fontFamily: 'monospace',
  },
});

export default App;