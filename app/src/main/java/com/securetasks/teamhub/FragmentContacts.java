package com.securetasks.teamhub;

/* public class FragmentContacts extends Fragment implements OnMapReadyCallback {

    public Context my_context;
    public View rootView;
    public ProgressDialog pd;
    public MediaPlayer mp;
    public NotificationManager mNotificationManager;
    public WebView webView;
    public SwipeRefreshLayout swipeContainer;
    private GoogleMap mMap;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        if (rootView == null) {
            rootView = inflater.inflate(R.layout.fragment_contacts, container, false);
        }

        my_context = container.getContext();


        webView = (WebView) rootView.findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);

        if (getString(R.string.contacts_type).equals("file")) {
            webView.loadUrl("file:///android_asset/" + getString(R.string.contacts_url));
        }  else if (getString(R.string.contacts_type).equals("url")) {
            webView.loadUrl(getString(R.string.contacts_url));
        }

        SupportMapFragment mapFragment = (SupportMapFragment) this.getChildFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        //Update menu item on navigation drawer when press back button
        ((MainActivity) getActivity()).SetItemChecked(3);


        return rootView;

    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if (url.startsWith("tel:")) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(url));
                startActivity(intent);
            }else if(url.startsWith("http:") || url.startsWith("https:")) {
                view.loadUrl(url);
            }
            return true;
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(Double.parseDouble(getString(R.string.coordinate_lat)), Double.parseDouble(getString(R.string.coordinate_long)));
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.animateCamera(CameraUpdateFactory.zoomTo(12.0f));
    }


}*/



