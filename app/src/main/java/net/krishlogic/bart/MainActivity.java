package net.krishlogic.bart;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import net.krishlogic.agencies.request.GetRealTimeEstimateRequest;
import net.krishlogic.agencies.request.GetStationsRequest;
import net.krishlogic.agencies.response.GetRealTimeEstimatesResponse;
import net.krishlogic.agencies.response.GetStationsResponse;
import net.krishlogic.agencies.response.model.RealtimeEstimateModel;
import net.krishlogic.agencies.response.model.StationsResponseModel;
import net.krishlogic.bart.model.ItemModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mTrainList;
    private LinearLayout mLinearLayout;
    private RelativeLayout mRelativeLayout;
    private ProgressBar mProgressBar;
    TrainListAdapter trainListAdapter;

    List<ItemModel> itemModelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        init();

        GetAllTrainTask getAllTrainTask = new GetAllTrainTask();
        getAllTrainTask.execute();

        trainListAdapter = new TrainListAdapter(itemModelList);

        mTrainList.setAdapter(trainListAdapter);
    }

    private void init() {
        mTrainList = (ListView) findViewById(R.id.listView);
        mLinearLayout = (LinearLayout) findViewById(R.id.linear_train_list);
        mRelativeLayout = (RelativeLayout) findViewById(R.id.relative_progress_spinner);
        mProgressBar = (ProgressBar) findViewById(R.id.progress_bar);
    }

    public class GetAllTrainTask extends AsyncTask {

        @Override
        protected void onPreExecute() {
        }

        @Override
        protected Object doInBackground(Object[] params) {

            GetStationsRequest request1 = new GetStationsRequest();
            GetStationsResponse response1 = new GetStationsResponse();

            GetRealTimeEstimateRequest request = new GetRealTimeEstimateRequest();
            request.setOriginAbbr("DUBL");

            GetRealTimeEstimatesResponse response = new GetRealTimeEstimatesResponse();

            try {
                StationsResponseModel stationsResponseModel = response1.getResponse(request1);
                System.out.println(stationsResponseModel.getStations().get(0).getName());

                RealtimeEstimateModel realtimeEstimateModel = response.getResponse(request);

                System.out.println(realtimeEstimateModel.getStation().getEtd().getAbbreviation());
                System.out.println(realtimeEstimateModel.getStation().getEtd().getEstimate().get(0).getMinutes());

            } catch (Exception e) {
                e.printStackTrace();
            }

            ItemModel  i1 = new ItemModel();
            ItemModel  i2 = new ItemModel();

            itemModelList.add(i1);
            itemModelList.add(i2);

            return itemModelList;
        }

        @Override
        protected void onPostExecute(Object o) {
            trainListAdapter = null;
            trainListAdapter = new TrainListAdapter(itemModelList);
            mTrainList.setAdapter(trainListAdapter);
        }

        @Override
        protected void onProgressUpdate(Object[] values) {
            super.onProgressUpdate(values);
        }
    }
}
