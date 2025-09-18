package com.yandex.runtime.sensors.internal;

import android.location.GnssMeasurementsEvent$Callback;
import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
import com.yandex.runtime.Runtime;
import java.util.ArrayList;
import java.util.Iterator;
import p000.L10;

/* loaded from: classes2.dex */
class GnssMeasurementsEventsPlatformProviderImpl extends GnssMeasurementsEvent$Callback implements GnssMeasurementsEventsPlatformProvider {
    private GnssMeasurementsEventsNativeListener listener;
    private final LocationManager locationManager;

    private GnssMeasurementsEventsPlatformProviderImpl(GnssMeasurementsEventsNativeListener gnssMeasurementsEventsNativeListener, LocationManager locationManager) {
        this.listener = gnssMeasurementsEventsNativeListener;
        this.locationManager = locationManager;
    }

    private static GnssClock convertClock(android.location.GnssClock gnssClock) {
        return new GnssClock(gnssClock.getTimeNanos(), gnssClock.hasTimeUncertaintyNanos() ? Double.valueOf(gnssClock.getTimeUncertaintyNanos()) : null, gnssClock.hasLeapSecond() ? Integer.valueOf(gnssClock.getLeapSecond()) : null, gnssClock.hasFullBiasNanos() ? Long.valueOf(gnssClock.getFullBiasNanos()) : null, gnssClock.hasBiasNanos() ? Double.valueOf(gnssClock.getBiasNanos()) : null, gnssClock.hasBiasUncertaintyNanos() ? Double.valueOf(gnssClock.getBiasUncertaintyNanos()) : null, gnssClock.hasDriftNanosPerSecond() ? Double.valueOf(gnssClock.getDriftNanosPerSecond()) : null, gnssClock.hasDriftUncertaintyNanosPerSecond() ? Double.valueOf(gnssClock.getDriftUncertaintyNanosPerSecond()) : null, gnssClock.getHardwareClockDiscontinuityCount());
    }

    private static GnssMeasurement convertGnssMeasurement(android.location.GnssMeasurement gnssMeasurement) {
        return new GnssMeasurement(gnssMeasurement.getConstellationType(), gnssMeasurement.getSvid(), gnssMeasurement.getAccumulatedDeltaRangeMeters(), gnssMeasurement.getAccumulatedDeltaRangeState(), gnssMeasurement.getAccumulatedDeltaRangeUncertaintyMeters(), gnssMeasurement.hasCarrierFrequencyHz() ? Float.valueOf(gnssMeasurement.getCarrierFrequencyHz()) : null, gnssMeasurement.getCn0DbHz(), gnssMeasurement.getPseudorangeRateMetersPerSecond(), gnssMeasurement.getPseudorangeRateUncertaintyMetersPerSecond(), gnssMeasurement.getReceivedSvTimeNanos(), gnssMeasurement.getReceivedSvTimeUncertaintyNanos(), gnssMeasurement.hasSnrInDb() ? Double.valueOf(gnssMeasurement.getSnrInDb()) : null, gnssMeasurement.getState(), gnssMeasurement.getTimeOffsetNanos(), gnssMeasurement.getMultipathIndicator(), gnssMeasurement.hasCarrierCycles() ? Long.valueOf(gnssMeasurement.getCarrierCycles()) : null, gnssMeasurement.hasCarrierPhase() ? Double.valueOf(gnssMeasurement.getCarrierPhase()) : null, gnssMeasurement.hasCarrierPhaseUncertainty() ? Double.valueOf(gnssMeasurement.getCarrierPhaseUncertainty()) : null);
    }

    public static GnssMeasurementsEventsPlatformProvider createProvider(GnssMeasurementsEventsNativeListener gnssMeasurementsEventsNativeListener) {
        LocationManager locationManager = (LocationManager) Runtime.getApplicationContext().getSystemService("location");
        if (locationManager == null) {
            return null;
        }
        GnssMeasurementsEventsPlatformProviderImpl gnssMeasurementsEventsPlatformProviderImpl = new GnssMeasurementsEventsPlatformProviderImpl(gnssMeasurementsEventsNativeListener, locationManager);
        gnssMeasurementsEventsPlatformProviderImpl.start();
        return gnssMeasurementsEventsPlatformProviderImpl;
    }

    private void start() {
        this.locationManager.registerGnssMeasurementsCallback(this, new Handler(Looper.getMainLooper()));
    }

    @Override // com.yandex.runtime.sensors.internal.GnssMeasurementsEventsPlatformProvider
    public void finish() {
        this.locationManager.unregisterGnssMeasurementsCallback(this);
        this.listener = null;
    }

    public void onGnssMeasurementsReceived(android.location.GnssMeasurementsEvent gnssMeasurementsEvent) {
        ArrayList arrayList = new ArrayList();
        Iterator it = gnssMeasurementsEvent.getMeasurements().iterator();
        while (it.hasNext()) {
            arrayList.add(convertGnssMeasurement(L10.m4847k(it.next())));
        }
        this.listener.onGnssMeasurementsEvent(new GnssMeasurementsEvent(convertClock(gnssMeasurementsEvent.getClock()), arrayList));
    }
}
