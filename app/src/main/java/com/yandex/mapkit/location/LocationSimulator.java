package com.yandex.mapkit.location;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;

/* loaded from: classes2.dex */
public interface LocationSimulator extends LocationManager {
    Polyline getGeometry();

    double getSpeed();

    boolean isActive();

    PolylinePosition polylinePosition();

    void setGeometry(Polyline polyline);

    void setLocationSpeedProviding(boolean z);

    void setSpeed(double d);

    void startSimulation(SimulationAccuracy simulationAccuracy);

    void stopSimulation();

    void subscribeForSimulatorEvents(LocationSimulatorListener locationSimulatorListener);

    void unsubscribeFromSimulatorEvents(LocationSimulatorListener locationSimulatorListener);
}
