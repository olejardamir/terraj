package src.core.BlockModels;

public class Header {
    private Version version;
    private String chain_id;
    private String height;
    private String time;
    private BlockID last_block_id;
    private String last_commit_hash;
    private String data_hash;
    private String validators_hash;
    private String next_validators_hash;
    private String consensus_hash;
    private String app_hash;
    private String last_results_hash;
    private String evidence_hash;
    private String proposer_address;
}
