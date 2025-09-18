package com.swmansion.reanimated.layoutReanimation;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.views.view.C1932a;
import com.swmansion.reanimated.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import p000.AbstractC11406vL1;
import p000.AbstractC6550oP;
import p000.C0295Eg;
import p000.C8810b60;
import p000.InterfaceC6947uP;
import p000.InterfaceC7136xP;
import p000.MD0;
import p000.OZ1;

/* loaded from: classes2.dex */
public class SharedTransitionManager {
    private final AnimationsManager mAnimationsManager;
    private NativeMethodsHolder mNativeMethodsHolder;
    private View mTransitionContainer;
    private final List<View> mAddedSharedViews = new ArrayList();
    private final Map<Integer, View> mSharedTransitionParent = new HashMap();
    private final Map<Integer, Integer> mSharedTransitionInParentIndex = new HashMap();
    private final Map<Integer, Snapshot> mSnapshotRegistry = new HashMap();
    private final Map<Integer, View> mCurrentSharedTransitionViews = new HashMap();
    private final Map<Integer, SortedSet<Integer>> mSharedViewChildrenIndices = new HashMap();
    private final List<View> mRemovedSharedViews = new ArrayList();
    private final Set<Integer> mViewTagsToHide = new HashSet();
    private final Map<Integer, Integer> mDisableCleaningForViewTag = new HashMap();
    private List<SharedElement> mSharedElements = new ArrayList();
    private final Map<Integer, SharedElement> mSharedElementsLookup = new HashMap();
    private final List<SharedElement> mSharedElementsWithProgress = new ArrayList();
    private final List<SharedElement> mSharedElementsWithAnimation = new ArrayList();
    private final Set<View> mReattachedViews = new HashSet();
    private boolean mIsTransitionPrepared = false;
    private final Set<Integer> mTagsToCleanup = new HashSet();

    public class PrepareConfigCleanupTreeVisitor implements TreeVisitor {
        public PrepareConfigCleanupTreeVisitor() {
        }

        @Override // com.swmansion.reanimated.layoutReanimation.SharedTransitionManager.TreeVisitor
        public void run(View view) {
            SharedTransitionManager.this.mTagsToCleanup.add(Integer.valueOf(view.getId()));
        }
    }

    public class SnapshotTreeVisitor implements TreeVisitor {
        public SnapshotTreeVisitor() {
        }

        @Override // com.swmansion.reanimated.layoutReanimation.SharedTransitionManager.TreeVisitor
        public void run(View view) {
            if (SharedTransitionManager.this.mAnimationsManager.hasAnimationForTag(view.getId(), 4)) {
                SharedTransitionManager.this.mRemovedSharedViews.add(view);
                SharedTransitionManager.this.makeSnapshot(view);
            }
        }
    }

    public class TopWillAppearListener implements InterfaceC7136xP {
        private final InterfaceC6947uP mEventDispatcher;

        public TopWillAppearListener(InterfaceC6947uP interfaceC6947uP) {
            this.mEventDispatcher = interfaceC6947uP;
        }

        @Override // p000.InterfaceC7136xP
        public void onEventDispatch(AbstractC6550oP abstractC6550oP) {
            if (abstractC6550oP.getEventName().equals("topWillAppear")) {
                SharedTransitionManager sharedTransitionManager = SharedTransitionManager.this;
                sharedTransitionManager.tryStartSharedTransitionForViews(sharedTransitionManager.mAddedSharedViews, true);
                SharedTransitionManager.this.mAddedSharedViews.clear();
                this.mEventDispatcher.mo11040a(this);
            }
        }
    }

    public interface TreeVisitor {
        void run(View view);
    }

    public SharedTransitionManager(AnimationsManager animationsManager) {
        this.mAnimationsManager = animationsManager;
    }

    private void clearAllSharedConfigsForView(View view) {
        int id = view.getId();
        this.mSnapshotRegistry.remove(Integer.valueOf(id));
        this.mNativeMethodsHolder.clearAnimationConfig(id);
    }

    private void disableCleaningForViewTag(int i) {
        Integer num = this.mDisableCleaningForViewTag.get(Integer.valueOf(i));
        if (num != null) {
            this.mDisableCleaningForViewTag.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
        } else {
            this.mDisableCleaningForViewTag.put(Integer.valueOf(i), 1);
        }
    }

    private void enableCleaningForViewTag(int i) {
        Integer num = this.mDisableCleaningForViewTag.get(Integer.valueOf(i));
        if (num == null) {
            return;
        }
        if (num.intValue() == 1) {
            this.mDisableCleaningForViewTag.remove(Integer.valueOf(i));
        } else {
            this.mDisableCleaningForViewTag.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View findScreen(View view) {
        for (ViewParent parent = view.getParent(); parent != 0; parent = parent.getParent()) {
            if (parent.getClass().getSimpleName().equals("RV0")) {
                return (View) parent;
            }
        }
        return null;
    }

    private void findSharedViewsForScreen(View view, List<View> list) {
        View topScreenForStack = ScreensHelper.getTopScreenForStack(view);
        if (topScreenForStack instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) topScreenForStack;
            if (this.mAnimationsManager.hasAnimationForTag(topScreenForStack.getId(), 4)) {
                list.add(topScreenForStack);
            }
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                findSharedViewsForScreen(viewGroup.getChildAt(i), list);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View findStack(View view) {
        for (ViewParent parent = view.getParent(); parent != 0; parent = parent.getParent()) {
            if (parent.getClass().getSimpleName().equals("mW0")) {
                return (View) parent;
            }
        }
        return null;
    }

    private List<SharedElement> getSharedElementsForCurrentTransition(List<View> list, boolean z) {
        boolean z2;
        ViewGroup viewGroup;
        boolean z3 = this.mReattachedViews.size() > 0;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        if (!z) {
            Iterator<View> it = list.iterator();
            while (it.hasNext()) {
                hashSet.add(Integer.valueOf(it.next().getId()));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ReanimatedNativeHierarchyManager reanimatedNativeHierarchyManager = this.mAnimationsManager.getReanimatedNativeHierarchyManager();
        HashSet hashSet2 = new HashSet();
        Iterator<View> it2 = this.mRemovedSharedViews.iterator();
        while (it2.hasNext()) {
            hashSet2.add(Integer.valueOf(it2.next().getId()));
        }
        for (View view : list) {
            int iFindPrecedingViewTagForTransition = this.mNativeMethodsHolder.findPrecedingViewTagForTransition(view.getId());
            if (z3) {
                while (hashSet2.contains(Integer.valueOf(iFindPrecedingViewTagForTransition))) {
                    this.mNativeMethodsHolder.clearAnimationConfig(iFindPrecedingViewTagForTransition);
                    iFindPrecedingViewTagForTransition = this.mNativeMethodsHolder.findPrecedingViewTagForTransition(view.getId());
                }
            }
            boolean z4 = !z && hashSet.contains(Integer.valueOf(iFindPrecedingViewTagForTransition));
            if (iFindPrecedingViewTagForTransition >= 0) {
                View viewMaybeOverrideSiblingForTabNavigator = maybeOverrideSiblingForTabNavigator(view, reanimatedNativeHierarchyManager.resolveView(iFindPrecedingViewTagForTransition));
                if (z) {
                    viewMaybeOverrideSiblingForTabNavigator = view;
                    view = viewMaybeOverrideSiblingForTabNavigator;
                }
                if (z4) {
                    clearAllSharedConfigsForView(view);
                    clearAllSharedConfigsForView(viewMaybeOverrideSiblingForTabNavigator);
                } else {
                    boolean zContainsKey = this.mCurrentSharedTransitionViews.containsKey(Integer.valueOf(view.getId()));
                    if (zContainsKey) {
                        z2 = z3;
                    } else {
                        View viewFindScreen = findScreen(view);
                        View viewFindScreen2 = findScreen(viewMaybeOverrideSiblingForTabNavigator);
                        if (viewFindScreen != null && viewFindScreen2 != null && (viewGroup = (ViewGroup) findStack(viewFindScreen)) != null) {
                            ViewGroupManager viewGroupManager = (ViewGroupManager) reanimatedNativeHierarchyManager.resolveViewManager(viewGroup.getId());
                            z2 = z3;
                            boolean z5 = false;
                            for (int i = 0; i < viewGroupManager.getChildCount((ViewGroupManager) viewGroup); i++) {
                                if (viewGroupManager.getChildAt((ViewGroupManager) viewGroup, i) == viewFindScreen2) {
                                    z5 = true;
                                }
                            }
                            if (z5) {
                                ViewGroupManager viewGroupManager2 = (ViewGroupManager) reanimatedNativeHierarchyManager.resolveViewManager(viewGroup.getId());
                                int childCount = viewGroupManager2.getChildCount((ViewGroupManager) viewGroup);
                                if (childCount >= 2) {
                                    View childAt = viewGroupManager2.getChildAt((ViewGroupManager) viewGroup, childCount - 1);
                                    View childAt2 = viewGroupManager2.getChildAt((ViewGroupManager) viewGroup, childCount - 2);
                                    if (!z ? !(childAt.getId() != viewFindScreen.getId() || childAt2.getId() != viewFindScreen2.getId()) : !(childAt2.getId() != viewFindScreen.getId() || childAt.getId() != viewFindScreen2.getId())) {
                                    }
                                }
                                z3 = z2;
                            }
                        }
                    }
                    Snapshot snapshot = null;
                    if (z) {
                        this.mViewTagsToHide.add(Integer.valueOf(view.getId()));
                        if (zContainsKey) {
                            snapshot = new Snapshot(view);
                        } else {
                            makeSnapshot(view);
                        }
                        makeSnapshot(viewMaybeOverrideSiblingForTabNavigator);
                    } else if (zContainsKey) {
                        makeSnapshot(view);
                    }
                    if (snapshot == null) {
                        snapshot = this.mSnapshotRegistry.get(Integer.valueOf(view.getId()));
                    }
                    Snapshot snapshot2 = this.mSnapshotRegistry.get(Integer.valueOf(viewMaybeOverrideSiblingForTabNavigator.getId()));
                    if (snapshot2 == null) {
                        makeSnapshot(viewMaybeOverrideSiblingForTabNavigator);
                    }
                    arrayList.add(view);
                    arrayList.add(viewMaybeOverrideSiblingForTabNavigator);
                    arrayList2.add(new SharedElement(view, snapshot, viewMaybeOverrideSiblingForTabNavigator, snapshot2));
                    z3 = z2;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            Iterator<SharedElement> it3 = this.mSharedElements.iterator();
            while (it3.hasNext()) {
                arrayList3.add(it3.next().sourceView);
            }
            HashSet hashSet3 = new HashSet();
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                hashSet3.add(((SharedElement) it4.next()).sourceView);
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                View view2 = (View) it5.next();
                if (!hashSet3.contains(view2)) {
                    this.mViewTagsToHide.remove(Integer.valueOf(view2.getId()));
                    view2.setVisibility(0);
                }
            }
            this.mCurrentSharedTransitionViews.clear();
            Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                View view3 = (View) it6.next();
                this.mCurrentSharedTransitionViews.put(Integer.valueOf(view3.getId()), view3);
            }
        }
        this.mSharedElements = arrayList2;
        Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            SharedElement sharedElement = (SharedElement) it7.next();
            this.mSharedElementsLookup.put(Integer.valueOf(sharedElement.sourceView.getId()), sharedElement);
        }
        return arrayList2;
    }

    public /* synthetic */ void lambda$finishSharedAnimation$1(ViewParent viewParent) {
        if (this.mReattachedViews.size() > 0) {
            return;
        }
        ((ViewGroup) viewParent).removeView(this.mTransitionContainer);
    }

    public static /* synthetic */ int lambda$sortViewsByTags$0(View view, View view2) {
        return Integer.compare(view2.getId(), view.getId());
    }

    private View maybeOverrideSiblingForTabNavigator(View view, View view2) {
        View tabNavigator = ScreensHelper.getTabNavigator(view);
        if (tabNavigator == null) {
            return view2;
        }
        int id = view2.getId();
        int[] sharedGroup = this.mNativeMethodsHolder.getSharedGroup(view.getId());
        int i = -1;
        for (int i2 = 0; i2 < sharedGroup.length; i2++) {
            if (sharedGroup[i2] == id) {
                i = i2;
            }
        }
        while (i >= 0) {
            View viewResolveView = this.mAnimationsManager.resolveView(sharedGroup[i]);
            if (tabNavigator == ScreensHelper.getTabNavigator(viewResolveView)) {
                return viewResolveView;
            }
            i--;
        }
        return view2;
    }

    private void maybeRestartAnimationWithNewLayout(View view) {
        View view2 = this.mCurrentSharedTransitionViews.get(Integer.valueOf(view.getId()));
        if (view2 == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (SharedElement sharedElement : this.mSharedElements) {
            if (sharedElement.targetView == view2) {
                arrayList.add(sharedElement);
                View view3 = sharedElement.sourceView;
                View view4 = sharedElement.targetView;
                Snapshot snapshot = new Snapshot(view3);
                Snapshot snapshot2 = this.mSnapshotRegistry.get(Integer.valueOf(view4.getId()));
                Snapshot snapshot3 = new Snapshot(view4);
                int i = (snapshot2.originX - snapshot2.originXByParent) + snapshot3.originX;
                int i2 = (snapshot2.originY - snapshot2.originYByParent) + snapshot3.originY;
                snapshot2.originX = i;
                snapshot2.originY = i2;
                snapshot2.globalOriginX = i;
                snapshot2.globalOriginY = i2;
                snapshot2.originXByParent = snapshot3.originXByParent;
                snapshot2.originYByParent = snapshot3.originYByParent;
                snapshot2.height = snapshot3.height;
                snapshot2.width = snapshot3.width;
                sharedElement.sourceViewSnapshot = snapshot;
                sharedElement.targetViewSnapshot = snapshot2;
                disableCleaningForViewTag(view3.getId());
                disableCleaningForViewTag(view4.getId());
            }
        }
        startSharedTransition(arrayList, 4);
    }

    private void reparentSharedViewsForCurrentTransition(List<SharedElement> list) {
        Iterator<SharedElement> it = list.iterator();
        while (it.hasNext()) {
            View view = it.next().sourceView;
            if (!this.mSharedTransitionParent.containsKey(Integer.valueOf(view.getId()))) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                int id = viewGroup.getId();
                int iIndexOfChild = viewGroup.indexOfChild(view);
                this.mSharedTransitionParent.put(Integer.valueOf(view.getId()), (View) view.getParent());
                this.mSharedTransitionInParentIndex.put(Integer.valueOf(view.getId()), Integer.valueOf(iIndexOfChild));
                SortedSet<Integer> sortedSet = this.mSharedViewChildrenIndices.get(Integer.valueOf(id));
                if (sortedSet == null) {
                    this.mSharedViewChildrenIndices.put(Integer.valueOf(id), new TreeSet(Collections.singleton(Integer.valueOf(iIndexOfChild))));
                } else {
                    sortedSet.add(Integer.valueOf(iIndexOfChild));
                }
            }
        }
        Iterator<SharedElement> it2 = list.iterator();
        while (it2.hasNext()) {
            View view2 = it2.next().sourceView;
            ((ViewGroup) view2.getParent()).removeView(view2);
            ((ViewGroup) this.mTransitionContainer).addView(view2);
            this.mReattachedViews.add(view2);
        }
    }

    private void setupTransitionContainer() {
        Activity currentActivity;
        if (this.mTransitionContainer == null) {
            this.mTransitionContainer = new C1932a(this.mAnimationsManager.getContext());
        }
        if (this.mTransitionContainer.getParent() != null || (currentActivity = this.mAnimationsManager.getContext().getCurrentActivity()) == null) {
            return;
        }
        ((ViewGroup) currentActivity.getWindow().getDecorView().getRootView()).addView(this.mTransitionContainer);
        this.mTransitionContainer.bringToFront();
    }

    private void sortViewsByTags(List<View> list) {
        Collections.sort(list, new C0295Eg(19));
    }

    private void startPreparedTransitions() {
        startSharedTransition(this.mSharedElementsWithAnimation, 4);
        startSharedTransition(this.mSharedElementsWithProgress, 5);
    }

    private void startSharedAnimationForView(View view, Snapshot snapshot, Snapshot snapshot2, int i) {
        HashMap<String, Object> targetMap = snapshot2.toTargetMap();
        HashMap<String, Object> mapPrepareDataForAnimationWorklet = this.mAnimationsManager.prepareDataForAnimationWorklet(snapshot.toCurrentMap(), false, true);
        HashMap<String, Object> map = new HashMap<>(this.mAnimationsManager.prepareDataForAnimationWorklet(targetMap, true, true));
        map.putAll(mapPrepareDataForAnimationWorklet);
        this.mNativeMethodsHolder.startAnimation(view.getId(), i, map);
    }

    private void startSharedTransition(List<SharedElement> list, int i) {
        for (SharedElement sharedElement : list) {
            View view = sharedElement.sourceView;
            view.setVisibility(0);
            startSharedAnimationForView(view, sharedElement.sourceViewSnapshot, sharedElement.targetViewSnapshot, i);
            sharedElement.targetView.setVisibility(4);
        }
    }

    public boolean tryStartSharedTransitionForViews(List<View> list, boolean z) {
        if (!prepareSharedTransition(list, z)) {
            return false;
        }
        startPreparedTransitions();
        return true;
    }

    private void visitTree(View view, TreeVisitor treeVisitor) {
        int id = view.getId();
        if (id == -1) {
            return;
        }
        ReanimatedNativeHierarchyManager reanimatedNativeHierarchyManager = this.mAnimationsManager.getReanimatedNativeHierarchyManager();
        try {
            treeVisitor.run(view);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                ViewManager viewManagerResolveViewManager = reanimatedNativeHierarchyManager.resolveViewManager(id);
                ViewGroupManager viewGroupManager = viewManagerResolveViewManager instanceof ViewGroupManager ? (ViewGroupManager) viewManagerResolveViewManager : null;
                if (viewGroupManager == null) {
                    return;
                }
                for (int i = 0; i < viewGroupManager.getChildCount((ViewGroupManager) viewGroup); i++) {
                    visitTree(viewGroupManager.getChildAt((ViewGroupManager) viewGroup, i), treeVisitor);
                }
            }
        } catch (C8810b60 unused) {
        }
    }

    public void doSnapshotForTopScreenViews(ViewGroup viewGroup) {
        if (viewGroup.getChildCount() > 0) {
            View childAt = viewGroup.getChildAt(0);
            if (childAt instanceof ViewGroup) {
                visitNativeTreeAndMakeSnapshot(((ViewGroup) childAt).getChildAt(0));
            }
        }
    }

    public void finishSharedAnimation(int i) {
        ViewParent parent;
        if (this.mDisableCleaningForViewTag.containsKey(Integer.valueOf(i))) {
            enableCleaningForViewTag(i);
            return;
        }
        SharedElement sharedElement = this.mSharedElementsLookup.get(Integer.valueOf(i));
        if (sharedElement == null) {
            return;
        }
        this.mSharedElementsLookup.remove(Integer.valueOf(i));
        View view = sharedElement.sourceView;
        if (this.mReattachedViews.contains(view)) {
            this.mReattachedViews.remove(view);
            int id = view.getId();
            ((ViewGroup) this.mTransitionContainer).removeView(view);
            View view2 = this.mSharedTransitionParent.get(Integer.valueOf(id));
            Integer num = this.mSharedTransitionInParentIndex.get(Integer.valueOf(id));
            int iIntValue = num.intValue();
            ViewGroup viewGroup = (ViewGroup) view2;
            int id2 = viewGroup.getId();
            SortedSet<Integer> sortedSet = this.mSharedViewChildrenIndices.get(Integer.valueOf(id2));
            int size = sortedSet.headSet(num).size();
            sortedSet.remove(num);
            if (sortedSet.isEmpty()) {
                this.mSharedViewChildrenIndices.remove(Integer.valueOf(id2));
            }
            int i2 = iIntValue - size;
            if (i2 <= viewGroup.getChildCount()) {
                viewGroup.addView(view, i2);
            } else {
                viewGroup.addView(view);
            }
            Snapshot snapshot = this.mSnapshotRegistry.get(Integer.valueOf(id));
            if (snapshot != null) {
                int i3 = snapshot.originX;
                int i4 = snapshot.originY;
                if (findStack(view) == null) {
                    snapshot.originX = snapshot.originXByParent;
                    snapshot.originY = snapshot.originYByParent;
                }
                HashMap<String, Object> basicMap = snapshot.toBasicMap();
                HashMap map = new HashMap();
                for (String str : basicMap.keySet()) {
                    Object obj = basicMap.get(str);
                    if (str.equals(Snapshot.TRANSFORM_MATRIX)) {
                        map.put(str, obj);
                    } else {
                        map.put(str, Double.valueOf(AbstractC11406vL1.m25402a(Utils.convertToFloat(obj))));
                    }
                }
                this.mAnimationsManager.progressLayoutAnimation(id, map, true);
                snapshot.originX = i3;
                snapshot.originY = i4;
            }
            if (this.mViewTagsToHide.contains(Integer.valueOf(i))) {
                view.setVisibility(4);
            }
            this.mCurrentSharedTransitionViews.remove(Integer.valueOf(sharedElement.targetView.getId()));
            this.mCurrentSharedTransitionViews.remove(Integer.valueOf(id));
            this.mSharedTransitionParent.remove(Integer.valueOf(id));
            this.mSharedTransitionInParentIndex.remove(Integer.valueOf(id));
        }
        sharedElement.targetView.setVisibility(0);
        if (this.mRemovedSharedViews.contains(view)) {
            this.mRemovedSharedViews.remove(view);
            this.mSnapshotRegistry.remove(Integer.valueOf(view.getId()));
            this.mNativeMethodsHolder.clearAnimationConfig(view.getId());
        }
        if (this.mReattachedViews.isEmpty()) {
            View view3 = this.mTransitionContainer;
            if (view3 != null && (parent = view3.getParent()) != null) {
                this.mTransitionContainer.post(new MD0(this, 20, parent));
            }
            this.mSharedElements.clear();
            this.mSharedElementsWithProgress.clear();
            this.mSharedElementsWithAnimation.clear();
            this.mViewTagsToHide.clear();
        }
    }

    public View getTransitioningView(int i) {
        return this.mCurrentSharedTransitionViews.get(Integer.valueOf(i));
    }

    public void makeSnapshot(View view) {
        this.mSnapshotRegistry.put(Integer.valueOf(view.getId()), new Snapshot(view));
    }

    public void navigationTabChanged(View view, View view2) {
        Snapshot snapshot;
        this.mAddedSharedViews.clear();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        findSharedViewsForScreen(view, arrayList2);
        sortViewsByTags(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            View view3 = (View) it.next();
            int[] sharedGroup = this.mNativeMethodsHolder.getSharedGroup(view3.getId());
            int length = sharedGroup.length - 1;
            while (true) {
                if (length >= 0) {
                    View viewResolveView = this.mAnimationsManager.resolveView(sharedGroup[length]);
                    if (ScreensHelper.isViewChildOfScreen(viewResolveView, view2) && (snapshot = this.mSnapshotRegistry.get(Integer.valueOf(view3.getId()))) != null) {
                        arrayList.add(new SharedElement(view3, snapshot, viewResolveView, new Snapshot(viewResolveView)));
                        break;
                    }
                    length--;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.mSharedElements = arrayList;
        this.mSharedElementsWithAnimation.clear();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            SharedElement sharedElement = (SharedElement) it2.next();
            this.mSharedElementsLookup.put(Integer.valueOf(sharedElement.sourceView.getId()), sharedElement);
            this.mSharedElementsWithAnimation.add(sharedElement);
        }
        setupTransitionContainer();
        reparentSharedViewsForCurrentTransition(arrayList);
        startSharedTransition(this.mSharedElementsWithAnimation, 4);
    }

    public void notifyAboutNewView(View view) {
        this.mAddedSharedViews.add(view);
    }

    public void notifyAboutRemovedView(View view) {
        this.mRemovedSharedViews.add(view);
    }

    public void onScreenWillDisappear() {
        Iterator<Integer> it = this.mTagsToCleanup.iterator();
        while (it.hasNext()) {
            this.mNativeMethodsHolder.clearAnimationConfig(it.next().intValue());
        }
        this.mTagsToCleanup.clear();
        if (this.mIsTransitionPrepared) {
            this.mIsTransitionPrepared = false;
            for (SharedElement sharedElement : this.mSharedElementsWithAnimation) {
                sharedElement.targetViewSnapshot = new Snapshot(sharedElement.targetView);
            }
            for (SharedElement sharedElement2 : this.mSharedElementsWithProgress) {
                sharedElement2.targetViewSnapshot = new Snapshot(sharedElement2.targetView);
            }
            startPreparedTransitions();
        }
    }

    public void onViewsRemoval(int[] iArr) {
        if (iArr == null) {
            return;
        }
        visitTreeForTags(iArr, new SnapshotTreeVisitor());
        if (this.mRemovedSharedViews.size() > 0) {
            boolean zPrepareSharedTransition = prepareSharedTransition(this.mRemovedSharedViews, false);
            this.mIsTransitionPrepared = zPrepareSharedTransition;
            if (!zPrepareSharedTransition) {
                this.mRemovedSharedViews.clear();
            }
            visitTreeForTags(iArr, new PrepareConfigCleanupTreeVisitor());
        }
    }

    public void orderByAnimationTypes(List<SharedElement> list) {
        this.mSharedElementsWithProgress.clear();
        this.mSharedElementsWithAnimation.clear();
        for (SharedElement sharedElement : list) {
            if (this.mAnimationsManager.hasAnimationForTag(sharedElement.sourceView.getId(), 5)) {
                this.mSharedElementsWithProgress.add(sharedElement);
            } else {
                this.mSharedElementsWithAnimation.add(sharedElement);
            }
        }
    }

    public boolean prepareSharedTransition(List<View> list, boolean z) {
        if (list.isEmpty()) {
            return false;
        }
        sortViewsByTags(list);
        List<SharedElement> sharedElementsForCurrentTransition = getSharedElementsForCurrentTransition(list, z);
        if (sharedElementsForCurrentTransition.isEmpty()) {
            return false;
        }
        setupTransitionContainer();
        reparentSharedViewsForCurrentTransition(sharedElementsForCurrentTransition);
        orderByAnimationTypes(sharedElementsForCurrentTransition);
        return true;
    }

    public void screenDidLayout(View view) {
        InterfaceC6947uP interfaceC6947uPM6091b;
        if (this.mAddedSharedViews.isEmpty() || (interfaceC6947uPM6091b = OZ1.m6091b((ReactContext) view.getContext(), view.getId())) == null) {
            return;
        }
        interfaceC6947uPM6091b.mo11049j(new TopWillAppearListener(interfaceC6947uPM6091b));
    }

    public void setNativeMethods(NativeMethodsHolder nativeMethodsHolder) {
        this.mNativeMethodsHolder = nativeMethodsHolder;
    }

    public void viewDidLayout(View view) {
    }

    public void visitNativeTreeAndMakeSnapshot(View view) {
        View topScreenForStack = ScreensHelper.getTopScreenForStack(view);
        if (topScreenForStack instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) topScreenForStack;
            if (this.mAnimationsManager.hasAnimationForTag(topScreenForStack.getId(), 4)) {
                makeSnapshot(topScreenForStack);
            }
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                visitNativeTreeAndMakeSnapshot(viewGroup.getChildAt(i));
            }
        }
    }

    public void visitTreeForTags(int[] iArr, TreeVisitor treeVisitor) {
        if (iArr == null) {
            return;
        }
        ReanimatedNativeHierarchyManager reanimatedNativeHierarchyManager = this.mAnimationsManager.getReanimatedNativeHierarchyManager();
        for (int i : iArr) {
            visitTree(reanimatedNativeHierarchyManager.resolveView(i), treeVisitor);
        }
    }
}
